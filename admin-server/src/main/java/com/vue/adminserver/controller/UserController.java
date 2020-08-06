package com.vue.adminserver.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.vue.adminserver.domain.entity.User;
import com.vue.adminserver.global.ResponseResult;
import com.vue.adminserver.global.constant.Constant;
import com.vue.adminserver.global.enums.BusinessEnum;
import com.vue.adminserver.global.enums.YesNoEnum;
import com.vue.adminserver.global.util.PageUtil;
import com.vue.adminserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 用户 前端控制器
 * </p>
 *
 * @author caishaodong
 * @since 2020-08-06
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 新增用户
     *
     * @param user
     * @param bindingResult
     * @return
     */
    @PostMapping("/save")
    public ResponseResult save(@RequestBody @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResponseResult.error(bindingResult);
        }
        // 校验手机号是否存在
        User exist = userService.getOne(new QueryWrapper<User>()
                .eq("mobile", user.getMobile())
                .eq(Constant.IS_DELETED, YesNoEnum.NO.getValue()));
        if (Objects.nonNull(exist)) {
            return ResponseResult.error(BusinessEnum.MOBILE_EXIST);
        }
        boolean success = userService.save(user);
        return success ? ResponseResult.success() : ResponseResult.error();
    }

    /**
     * 根据id删除用户
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public ResponseResult delete(@PathVariable(value = "id") Integer id) {
        User user = userService.getOne(new QueryWrapper<User>()
                .eq(Constant.ID, id)
                .eq(Constant.IS_DELETED, YesNoEnum.NO.getValue()));
        if (Objects.isNull(user)) {
            return ResponseResult.error(BusinessEnum.USER_NOT_EXIST);
        }

        user.setIsDeleted(YesNoEnum.YES.getValue());

        boolean success = userService.updateById(user);
        return success ? ResponseResult.success() : ResponseResult.error();
    }

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    @PutMapping("/update")
    public ResponseResult update(@RequestBody @Valid User user, BindingResult bindingResult) {
        if (Objects.isNull(user.getId())) {
            return ResponseResult.error(BusinessEnum.PARAM_ERROR);
        }
        User exist = userService.getOne(new QueryWrapper<User>()
                .eq(Constant.ID, user.getId())
                .eq(Constant.IS_DELETED, YesNoEnum.NO.getValue()));
        if (Objects.isNull(exist)) {
            return ResponseResult.error(BusinessEnum.USER_NOT_EXIST);
        }

        // 校验手机号是否存在
        User mobileUser = userService.getOne(new QueryWrapper<User>()
                .eq("mobile", user.getMobile())
                .eq(Constant.IS_DELETED, YesNoEnum.NO.getValue())
                .ne(Constant.ID, user.getId()));
        if (Objects.nonNull(mobileUser)) {
            return ResponseResult.error(BusinessEnum.MOBILE_EXIST);
        }

        exist.setName(user.getName());
        exist.setMobile(user.getMobile());
        exist.setPassword(user.getPassword());
        exist.setMobile(user.getMobile());
        exist.setAge(user.getAge());
        exist.setAddress(user.getAddress());
        boolean success = userService.updateById(exist);
        return success ? ResponseResult.success() : ResponseResult.error();
    }

    /**
     * 根据id查找用户
     *
     * @param id
     * @return
     */
    @GetMapping("/getById/{id}")
    public ResponseResult getById(@PathVariable(value = "id") Integer id) {
        User user = userService.getOne(new QueryWrapper<User>()
                .eq(Constant.ID, id)
                .eq(Constant.IS_DELETED, YesNoEnum.NO.getValue()));
        if (Objects.isNull(user)) {
            return ResponseResult.error(BusinessEnum.USER_NOT_EXIST);
        }
        return ResponseResult.success(user);
    }

    /**
     * 查找所有用户
     *
     * @return
     */
    @GetMapping("/getList")
    public ResponseResult getList() {
        List<User> list = userService.list(new QueryWrapper<User>()
                .eq(Constant.IS_DELETED, YesNoEnum.NO.getValue()));
        return ResponseResult.success(list);
    }

    /**
     * 查找所有用户 分页
     *
     * @return
     */
    @GetMapping("/getListPage")
    public ResponseResult getListPage() {
        PageUtil<User> pageUtil = new PageUtil<>();
        IPage<User> page = userService.page(pageUtil, new QueryWrapper<User>()
                .eq(Constant.IS_DELETED, YesNoEnum.NO.getValue()));
        return ResponseResult.success(page);
    }


}
