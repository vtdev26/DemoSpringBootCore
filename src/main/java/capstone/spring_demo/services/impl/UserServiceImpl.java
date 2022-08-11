package capstone.spring_demo.services.impl;

import capstone.spring_demo.domain.entity.User;
import capstone.spring_demo.domain.request.UserRequestDto;
import capstone.spring_demo.domain.response.UserResponseDto;
import capstone.spring_demo.repository.UserRepository;
import capstone.spring_demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserResponseDto findAll() {
        Iterable<User> userIterable = userRepository.findAll();
        List<User> users = StreamSupport.stream(userIterable.spliterator(), false).collect(Collectors.toList());
        UserResponseDto userResponseDto = new UserResponseDto();
        userResponseDto.setUsers(users);
        return userResponseDto;
    }

    @Override
    public UserRequestDto save(UserRequestDto userRequestDto) {
        User user = new User();
        user.setId(userRequestDto.getId());
        user.setAddress(userRequestDto.getAddress());
        user.setGender(userRequestDto.getGender());
        user.setFullName(userRequestDto.getFullName());
        user.setIdentityCard(userRequestDto.getIdentityCard());
        user.setEmail(userRequestDto.getEmail());

        userRepository.save(user);
        return userRequestDto;
    }
}
