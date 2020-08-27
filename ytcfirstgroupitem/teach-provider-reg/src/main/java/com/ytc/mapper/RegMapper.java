package com.ytc.mapper;

import com.ytc.model.User;
import org.springframework.web.bind.annotation.RequestBody;

public interface RegMapper {
    void RegAdd(@RequestBody User user);
}
