package cdu.edu.cn.controller;

import cdu.edu.cn.dto.Infodto;
import cdu.edu.cn.entity.Info;
import cdu.edu.cn.entity.Message;
import org.apache.ibatis.logging.Log;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class InfoController {


    @MessageMapping("/upInfo")//@MessageMapping和@RequestMapping功能类似，用于设置URL映射地址，浏览器向服务器发起请求，需要通过该地址。
    @SendTo("/topic/chatroom")  //@SendTo和SendToUser，前者属于广播，可以用来实现聊天室和公告等功能，后者可以实现点对点式通讯
    public Infodto say(Infodto infodto) throws Exception {

        return infodto;
    }
}
