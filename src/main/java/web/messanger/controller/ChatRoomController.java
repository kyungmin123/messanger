package web.messanger.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.messanger.dto.ChatRoomRequest;
import web.messanger.model.ChatRoom;
import web.messanger.service.ChatRoomService;

import java.util.List;

@RestController
@RequestMapping("/api/chats")
public class ChatRoomController {
    private final ChatRoomService chatRoomService;

    public ChatRoomController(ChatRoomService chatRoomService) {
        this.chatRoomService = chatRoomService;
    }

    // 채팅방 생성
    @PostMapping
    public ResponseEntity<ChatRoom> createChatRoom(@RequestBody ChatRoomRequest request) {
        ChatRoom chatRoom = chatRoomService.createChatRoom(request);
        return ResponseEntity.ok(chatRoom);
    }

    // 사용자 채팅방 목록 조회
    @GetMapping
    public ResponseEntity<List<ChatRoom>> getUserChatRooms(@RequestParam Long userId) {
        List<ChatRoom> chatRooms = chatRoomService.getUserChatRooms(userId);
        return ResponseEntity.ok(chatRooms);
    }

    // 특정 채팅방 조회
    @GetMapping("/{id}")
    public ResponseEntity<ChatRoom> getChatRoom(@PathVariable Long id) {
        ChatRoom chatRoom = chatRoomService.getChatRoom(id);
        return ResponseEntity.ok(chatRoom);
    }

    // 채팅방 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChatRoom(@PathVariable Long id) {
        chatRoomService.deleteChatRoom(id);
        return ResponseEntity.noContent().build();
    }
}
