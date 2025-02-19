package web.messanger.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import web.messanger.dto.MessageRequest;
import web.messanger.model.Message;
import web.messanger.repository.MessageRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;

    public Message getMessage(Long messageId) {
        return messageRepository.findById(messageId)
                .orElseThrow(() -> new IllegalArgumentException("해당 아이디가 없습니다. id = " + messageId));
    }

    public Message createMessage(MessageRequest messageRequest) {
        Message message = new Message();

        message.setContent(messageRequest.getContent());
        message.setWriterId(messageRequest.getWriterId());
        message.setWriteDt(messageRequest.getWriteDt());

        return messageRepository.save(message);
    }

    public void deleteMessage(Long messageId) {
        messageRepository.deleteById(messageId);
    }

}
