package com.yummy.service.impl;

import com.yummy.model.User;
import com.yummy.mapper.UserMapper;
import com.yummy.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author andrew
 * @since 2022-06-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User getUser(Integer id) {
        return this.getById(id);
    }
}
