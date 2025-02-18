package web.messanger.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.messanger.model.Message;
import web.messanger.repository.MessageRepository;
import web.messanger.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;

    public List<Message> GetMessage() {
        //TODO: 메시지 조회

        return null;
    }

    public Message CreateMessage() {
        //TODO: 메시지 생성

        return null;
    }

    public Message DeleteMessage() {
        //TODO: 메시지 삭제

        return null;
    }

}
