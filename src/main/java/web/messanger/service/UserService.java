package web.messanger.service;

import web.messanger.dto.UserRequest;
import web.messanger.model.User;
import web.messanger.repository.UserRepository;

public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());

        return userRepository.save(user);
    }

    public User getUser(Long userId) {
        return userRepository.findByUserId(userId).get(0);
    }

//    public User updateUser(Long userId, UserRequest userRequest) {
//        User user = userRepository.findByUserId(userId)
//                .orElseThrow(() -> new IllegalArgumentException("해당 아이디가 없습니다. id = " + userId));
//        user.update(userRequest);
//        return user;
//    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
