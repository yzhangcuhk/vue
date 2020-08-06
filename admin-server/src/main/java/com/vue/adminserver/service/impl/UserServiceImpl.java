package com.vue.adminserver.service.impl;

import com.vue.adminserver.domain.entity.User;
import com.vue.adminserver.mapper.UserMapper;
import com.vue.adminserver.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author caishaodong
 * @since 2020-08-06
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
