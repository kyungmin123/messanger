package web.messanger.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.messanger.dto.MessageRequest;
import web.messanger.model.Message;
import web.messanger.service.MessageService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/message")
public class MessageController {
    private final MessageService messageService;

    // 메시지 생성
    @PostMapping
    public ResponseEntity<Message> createChatRoom(@RequestBody MessageRequest request) {
        Message message = messageService.createMessage(request);
        return ResponseEntity.ok(message);
    }

    // 메시지 조회
    @GetMapping
    public ResponseEntity<List<Message>> getUserChatRooms(@RequestParam Long messageId) {
        // TODO: 메시지 다건 조회가 가능해야 함

        // TODO 채팅방에 참여한 유저들의 채팅 목록을 가져와야 함

        //List<Message> message = messageService.getMessage(messageId);
        List<Message> message = null;
        return ResponseEntity.ok(message);
    }

    // 메시지 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChatRoom(@PathVariable Long messageId) {
        messageService.deleteMessage(messageId);
        return ResponseEntity.noContent().build();
    }
}

