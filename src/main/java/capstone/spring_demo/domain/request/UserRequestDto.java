package capstone.spring_demo.domain.request;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UserRequestDto {
    private Integer id;
    private String address;
    private String email;
    private String fullName;
    private String gender;
    private String identityCard;
}
