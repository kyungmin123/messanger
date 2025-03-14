//package web.messanger.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import web.messanger.dto.MessageRequest;
//import web.messanger.model.Message;
//import web.messanger.service.MessageService;
//
//import java.util.List;
//
//@RequiredArgsConstructor
//@RestController
//@RequestMapping("/api/message")
//public class MessageController {
//    private final MessageService messageService;
//
//    // 메시지 생성
//    @PostMapping
//    public ResponseEntity<Message> createMessage(@RequestBody MessageRequest request) {
//        Message message = messageService.createMessage(request);
//        return ResponseEntity.ok(message);
//    }
//
//    // 메시지 조회
//    @GetMapping
//    public ResponseEntity<List<Message>> getMessages(@RequestParam Long chatRoomId) {
//        List<Message> messages = messageService.getMessagesByChatRoomId(chatRoomId);
//        return ResponseEntity.ok(messages);
//    }
//
//    // 메시지 삭제
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteMessage(@PathVariable Long messageId) {
//        messageService.deleteMessage(messageId);
//        return ResponseEntity.noContent().build();
//    }
//}
//
