package web.messanger.dto;

import lombok.Getter;
import lombok.Setter;
//import web.messanger.model.ChatRoom;

import java.util.List;

@Getter
@Setter
public class UserRequest {
    public String name;
    public String email;
    public String password;
//    public List<ChatRoom> chatRooms;
}
