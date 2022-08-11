package capstone.spring_demo.domain.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UserRequestDto {
    private Integer id;
    @JsonProperty("address")
    private String address;
    @JsonProperty("email")
    private String email;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("gender")
    private String gender;
    @JsonProperty("identityCard")
    private String identityCard;
}
