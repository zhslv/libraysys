package com.zhs.sys.controller;

import com.zhs.sys.domain.User;
import com.zhs.sys.service.UserService;
import com.zhs.sys.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private UserService userService;

    //跳转到登录页面
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }

    //登录
    @RequestMapping("login")
    public String Login(UserVo userVo, HttpSession session, Model model){
        User user = userService.login(userVo);
        if (user!=null) {
            session.setAttribute("user",user);
            //更新登陆时间
            userService.updateUser(user.getUserid());
            return "redirect:../bookInfo/queryAllBookInfo.action";
        }else{
            model.addAttribute("error","用户名或密码不正确");
            return "login";
        }

    }
}
