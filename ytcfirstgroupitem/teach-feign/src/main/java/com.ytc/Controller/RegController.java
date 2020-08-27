package com.ytc.Controller;

import com.ytc.Service.RegService;
import com.ytc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:chengwenbin
 * @date：2020/8/25
 * @time:11:45
 */
@Controller
public class RegController {

    @Autowired
    private RegService regService;

    @PostMapping ("RegAdd")
    @ResponseBody
    public void RegAdd(User user){
        System.out.println(user.getUserName());
        regService.RegAdd(user);
    }

}
