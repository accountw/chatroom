package cdu.edu.cn.controller;

import cdu.edu.cn.entity.Info;
import cdu.edu.cn.entity.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.util.HtmlUtils;

import javax.annotation.Resource;



@Controller
public class SystemController {






    @GetMapping("/")
    public  String login(){
        return "login";
    }

    @GetMapping("/index")
    public String  index(){
        return "index";
    }

}
