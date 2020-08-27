package com.ytc.mapper;

import com.ytc.model.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserMapper {
    User login(@RequestBody User user);
}