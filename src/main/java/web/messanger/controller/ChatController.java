package web.messanger.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import web.messanger.dto.ChatMessage;

@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage") // "/app/chat.sendMessage" 로 메시지 전송
    @SendTo("/topic/public") // 모든 구독자에게 메시지 전송
    public ChatMessage sendMessage(ChatMessage message) {
        return message;
    }
}
