package web.messanger.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String password;

    private String email;

//    @ManyToMany
//    @JoinTable(
//            name = "user_chatroom",
//            joinColumns = @JoinColumn(name = "user_id"),
//            inverseJoinColumns =  @JoinColumn(name = "chatroom_id")
//    )
//    private List<ChatRoom> chatRooms = new ArrayList<>();

    @Override
    public String toString() {
        return "ChatRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
