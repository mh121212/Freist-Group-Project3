package com.ytc.service;

import com.ytc.model.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface RegService {
    void RegAdd(@RequestBody User user);
}
