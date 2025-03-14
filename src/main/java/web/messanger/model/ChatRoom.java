//package web.messanger.model;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.hibernate.annotations.CreationTimestamp;
//
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.List;
//
//@Setter
//@Getter
//@Entity
//public class ChatRoom {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id; // 채팅방 ID
//
//    private String name; // 채팅방 이름
//
//    private String type; // 채팅방 타입 (1:1, 그룹, 오픈채팅 등)
//
//    @ManyToMany(mappedBy = "chatRooms")
//    private List<ChatRoomUser> users = new ArrayList<>();
//
//    @CreationTimestamp
//    private LocalDateTime createdDt;
//
//    @Override
//    public String toString() {
//        return "ChatRoom{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", type='" + type + '\'' +
//                ", createdAt=" + createdDt +
//                '}';
//    }
//}
