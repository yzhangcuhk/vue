package com.vue.adminserver.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.vue.adminserver.domain.entity.SysUser;
import com.vue.adminserver.global.ResponseResult;
import com.vue.adminserver.global.constant.Constant;
import com.vue.adminserver.global.enums.BusinessEnum;
import com.vue.adminserver.global.enums.UserStatusEnum;
import com.vue.adminserver.global.enums.YesNoEnum;
import com.vue.adminserver.global.util.StringUtil;
import com.vue.adminserver.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author caishaodong
 * @since 2020-08-06
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping("/login")
    public ResponseResult login(@RequestBody SysUser sysUser) {
        String loginName = sysUser.getLoginName();
        String password = sysUser.getPassword();
        if(StringUtil.isBlank(loginName)) {
            return ResponseResult.error(BusinessEnum.LOGIN_NAME_IS_EMPTY);
        }
        if(StringUtil.isBlank(password)) {
            return ResponseResult.error(BusinessEnum.PASSWORD_IS_EMPTY);
        }

        SysUser existUser = sysUserService.getOne(new QueryWrapper<SysUser>().eq("login_name", loginName)
                .eq("password", password).eq(Constant.IS_DELETED, YesNoEnum.NO.getValue()));
        if (Objects.isNull(existUser)) {
            return ResponseResult.error(BusinessEnum.LOGIN_NAME_OR_PASSWORD_ERROR);
        }

        if (existUser.getStatus().intValue() == UserStatusEnum.CANCEL.getStatus()) {
            return ResponseResult.error(BusinessEnum.USER_CANCEL);
        } else if (existUser.getStatus().intValue() == UserStatusEnum.FROZEN.getStatus()) {
            return ResponseResult.error(BusinessEnum.USER_FROZEN);
        }

        return ResponseResult.success();
    }

}
