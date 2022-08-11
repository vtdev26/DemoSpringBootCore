package capstone.spring_demo.services;

import capstone.spring_demo.domain.request.UserRequestDto;
import capstone.spring_demo.domain.response.UserResponseDto;

public interface UserService {
    UserResponseDto findAll();

    UserRequestDto save(UserRequestDto userRequestDto);
}
