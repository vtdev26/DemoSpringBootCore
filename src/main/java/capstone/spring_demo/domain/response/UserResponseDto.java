package capstone.spring_demo.domain.response;

import capstone.spring_demo.domain.entity.User;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UserResponseDto {
    List<User> users;
    User user;
}
