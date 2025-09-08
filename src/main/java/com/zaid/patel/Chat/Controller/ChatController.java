package com.zaid.patel.Chat.Controller;

import com.zaid.patel.Chat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChatController {
    @MessageMapping("/sendMessage") //When any of the message is received to this end point it will be broadcasted to bellow endpoint
    @SendTo("/topic/message")
    public ChatMessage chatMessage(ChatMessage message){
        return message;
    }
    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}
