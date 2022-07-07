package prft.developerProject.PRFT_Developer_Project.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    private UUID userID;
    private String firstName;
    private String lastName;
    private String gender;
    private Integer age;
    private String emailID;
    private Long phoneNumber;
    }


