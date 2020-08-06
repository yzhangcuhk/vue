package com.vue.adminserver.service.impl;

import com.vue.adminserver.domain.entity.SysUser;
import com.vue.adminserver.mapper.SysUserMapper;
import com.vue.adminserver.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author caishaodong
 * @since 2020-08-06
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

}
