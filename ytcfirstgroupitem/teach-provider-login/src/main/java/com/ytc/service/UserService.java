package com.ytc.service;

import com.ytc.model.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService {
    User login(@RequestBody User user);
}
