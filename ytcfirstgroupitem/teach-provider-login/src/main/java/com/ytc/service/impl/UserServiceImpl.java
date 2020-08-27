package com.ytc.service.impl;

import com.ytc.mapper.UserMapper;
import com.ytc.model.User;
import com.ytc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(@RequestBody User user) {
        return userMapper.login(user);
    }
}
