package com.ytc.Service;

import com.ytc.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "teach-provider-login")
public interface UserService {

    @RequestMapping("toLogin")
    String toLogin();
    @RequestMapping("toIndex")
    String toIndex();

    @RequestMapping("toReg")
    String toReg();


    @PostMapping("login")
    User login(@RequestBody User user);
}

