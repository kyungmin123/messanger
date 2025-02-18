package web.messanger.dto;

import lombok.Getter;
import lombok.Setter;
import web.messanger.model.ChatRoomUser;
import web.messanger.model.Message;

import java.util.List;

@Getter
@Setter
public class MessageRequest {
    private String name;
    private List<ChatRoomUser> chatRoomUsers;
    private List<Message> messages;
}
