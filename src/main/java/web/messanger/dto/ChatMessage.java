package web.messanger.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChatMessage {
    private String sender;
    private String content;
    private String type; // "ENTER", "CHAT", "LEAVE"
}
