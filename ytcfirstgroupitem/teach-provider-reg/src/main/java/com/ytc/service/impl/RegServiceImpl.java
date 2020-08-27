package com.ytc.service.impl;

import com.ytc.mapper.RegMapper;
import com.ytc.model.User;
import com.ytc.service.RegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author:chengwenbin
 * @date：2020/8/25
 * @time:11:47
 */
@Service
public class RegServiceImpl implements RegService {

    @Autowired
   private RegMapper regMapper;
    @Override
    public void RegAdd(@RequestBody User user) {

        regMapper.RegAdd(user);
    }
}
