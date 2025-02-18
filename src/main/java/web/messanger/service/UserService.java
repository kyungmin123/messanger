package web.messanger.service;

import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import web.messanger.dto.UserRequest;
import web.messanger.model.User;
import web.messanger.repository.UserRepository;

@RequiredArgsConstructor
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public User createUser(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());

        return userRepository.save(user);
    }

    public User getUser(Long userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("해당 아이디가 없습니다. id = " + userId));
    }

    public User updateUser(Long userId, UserRequest userRequest) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("해당 아이디가 없습니다. id = " + userId));

        user.setName(userRequest.getName());
        user.setEmail(userRequest.getEmail());

        return user;
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
