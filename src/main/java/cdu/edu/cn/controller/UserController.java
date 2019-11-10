package cdu.edu.cn.controller;


import cdu.edu.cn.dto.Userdto;
import cdu.edu.cn.entity.User;
import cdu.edu.cn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import javax.servlet.http.HttpSession;
import java.util.Scanner;


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
            User user1=userService.getuserbyid(userdto.getId());

            session.setAttribute("name",user1.getName());
            session.setAttribute("id",userdto.getId());
            return "0";
        }

        return "1";
    }





}
