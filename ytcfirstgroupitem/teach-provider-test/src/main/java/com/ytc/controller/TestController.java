package com.ytc.controller;

import com.ytc.model.Test;
import com.ytc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("addTest")

    public void addTest(@RequestBody Test test){
        Test t = new Test();
        t.setTestage(1);
        t.setTesthobby("1,2,3");
        t.setTeststatus(1);
        t.setTestname("王五");
        t.setTestphone("13831405315");
        testService.addTest(t);
    }
}
