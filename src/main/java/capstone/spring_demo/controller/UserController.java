package capstone.spring_demo.controller;

import capstone.spring_demo.domain.request.UserRequestDto;
import capstone.spring_demo.domain.response.UserResponseDto;
import capstone.spring_demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public UserResponseDto findAll(){
        return userService.findAll();
    }

    @PostMapping
    public UserRequestDto update(@RequestBody UserRequestDto userRequestDto){
        return userService.save(userRequestDto);
    }
}
