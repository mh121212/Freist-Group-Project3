package com.ytc.service.impl;

import com.ytc.mapper.TestMapper;
import com.ytc.model.Test;
import com.ytc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public void addTest(@RequestBody Test test) {

        testMapper.addTest(test);
    }
}
