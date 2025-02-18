package web.messanger.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private String writerId;

    private Date writeDt;

    @Override
    public String toString() {
        return "Message {" +
                "id=" + id +
                ", content ='" + content + '\'' +
                ", writer_id ='" + writerId + '\'' +
                ", write_dt =" + writeDt +
                '}';
    }
}
