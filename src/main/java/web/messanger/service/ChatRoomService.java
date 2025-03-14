//package web.messanger.service;
//
//import org.springframework.stereotype.Service;
//import web.messanger.dto.ChatRoomRequest;
//import web.messanger.model.ChatRoom;
//import web.messanger.model.ChatRoomUser;
//import web.messanger.model.User;
//import web.messanger.repository.ChatRoomRepository;
//import web.messanger.repository.UserRepository;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
//@Service
//public class ChatRoomService {
//    private final ChatRoomRepository chatRoomRepository;
//    private final UserRepository userRepository;
//
//    public ChatRoomService(ChatRoomRepository chatRoomRepository, UserRepository userRepository) {
//        this.chatRoomRepository = chatRoomRepository;
//        this.userRepository = userRepository;
//    }
//
//    // 채팅방 생성
//    public ChatRoom createChatRoom(ChatRoomRequest chatRoomRequest) {
//        ChatRoom chatRoom = new ChatRoom();
//        chatRoom.setName(chatRoomRequest.getName());
//        chatRoom.setType(chatRoomRequest.getType());
//
////        List<ChatRoomUser> chatRoomUsers = chatRoomRequest.getUserIds().stream()
////                .map(userId -> {
////                    User user = userRepository.findById(userId)
////                            .orElseThrow(() -> new RuntimeException("User not found: " + userId));
////                    ChatRoomUser chatRoomUser = new ChatRoomUser();
////                    chatRoomUser.setChatRoom(chatRoom);
////                    chatRoomUser.setUser(user);
////                    return chatRoomUser;
////                })
////                .collect(Collectors.toList());
////
////        chatRoom.setUsers(chatRoomUsers);
//        return chatRoomRepository.save(chatRoom);
//    }
//
//    // 사용자 채팅방 목록 조회
//    public List<ChatRoom> getAllChatRooms(Long userId) {
//        return chatRoomRepository.findByUserId(userId);
//    }
//
//    // 특정 채팅방 조회
//    public ChatRoom getChatRoom(Long id) {
//        return chatRoomRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Chat room not found: " + id));
//    }
//
//    // 채팅방 삭제
//    public void deleteChatRoom(Long id) {
//        chatRoomRepository.deleteById(id);
//    }
//}
//
