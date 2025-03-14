//package web.messanger.service;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import web.messanger.dto.MessageRequest;
//import web.messanger.model.Message;
//import web.messanger.repository.MessageRepository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class MessageService {
//    private final MessageRepository messageRepository;
//
//    public List<Message> getMessagesByChatRoomId(Long chatRoomId) {
//        return messageRepository.findByChatRoomId(chatRoomId)
//                .orElse(new ArrayList<Message>());
//    }
//
//    public Message createMessage(MessageRequest messageRequest) {
//        Message message = new Message();
//
//        message.setContent(messageRequest.getContent());
//        message.setWriterId(messageRequest.getWriterId());
//        message.setWriteDt(messageRequest.getWriteDt());
//
//        return messageRepository.save(message);
//    }
//
//    public void deleteMessage(Long messageId) {
//        messageRepository.deleteById(messageId);
//    }
//
//}
