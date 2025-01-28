package web.messanger.service;

import web.messanger.model.User;
import web.messanger.repository.ChatRoomRepository;
import web.messanger.repository.UserRepository;

import java.util.List;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser(String userName) {
        User user = new User();
        user.setName(userName);

        return userRepository.save(user);
    }

    public User getUser(Long userId) {
        // TODO: User 조회 구현
        return null;
    }

    public List<User> getUsers(List<Long> userIds) {
        // TODO: User List 조회 구현
        return null;
    }
}
