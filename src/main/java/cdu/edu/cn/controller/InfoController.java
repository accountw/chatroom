package cdu.edu.cn.controller;

import cdu.edu.cn.dto.Infodto;
import cdu.edu.cn.entity.Info;
import cdu.edu.cn.entity.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

public class InfoController {


    @MessageMapping("/upInfo")//@MessageMapping和@RequestMapping功能类似，用于设置URL映射地址，浏览器向服务器发起请求，需要通过该地址。
    @SendTo("/topic/info")
    public Infodto say(Infodto infodto) throws Exception {

        return  infodto;
    }
}
