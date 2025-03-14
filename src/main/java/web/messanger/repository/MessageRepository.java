//package web.messanger.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//import web.messanger.model.Message;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface MessageRepository extends JpaRepository<Message, Long> {
//    Optional<List<Message>> findByChatRoomId(Long id);
//}