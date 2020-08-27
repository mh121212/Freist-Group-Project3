package com.ytc.Controller;


import com.ytc.Service.UserService;
import com.ytc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }

    @PostMapping("login")
    @ResponseBody
    public String login(User user, HttpServletRequest request){
        User u = userService.login(user);
        if(u!=null){
            if(!(user.getUserPassword().equals(u.getUserPassword()))){
                return "2";
            }
        }else{
            return "1";
        }
        HttpSession session = request.getSession();
        session.setAttribute("user",u);
        System.out.println(u);
        return "3";
    }

    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("toReg")
    public String toReg(){
        return "reg";
    }
}
