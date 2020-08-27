package com.ytc.controller;

import com.ytc.model.User;
import com.ytc.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:chengwenbin
 * @date：2020/8/25
 * @time:11:45
 */
@RestController
public class RegController {

    @Autowired
    private RegService regService;

    @PostMapping("RegAdd")
    public void RegAdd(@RequestBody User user){
      regService.RegAdd(user);
    }
}
