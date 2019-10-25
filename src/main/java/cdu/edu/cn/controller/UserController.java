package cdu.edu.cn.controller;


import cdu.edu.cn.dto.Userdto;
import cdu.edu.cn.entity.User;
import cdu.edu.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String login(@RequestBody Userdto userdto, HttpSession session){
        User user=new User();
        System.out.println(userdto.getId());
        user.setId(userdto.getId());
        user.setPassword(userdto.getPassword());
        if(userService.checkUser(user)){
            return "0";
        }

        return "1";
    }





}
