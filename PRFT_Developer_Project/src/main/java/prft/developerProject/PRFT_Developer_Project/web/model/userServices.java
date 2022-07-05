package prft.developerProject.PRFT_Developer_Project.web.model;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class userServices {

    private UUID userID;
    private String firstName;
    private String lastName;
    private String gender;
    private Integer age;
    private String emailID;
    private Long phoneNumber;

    public userServices(UUID userID, String firstName, String lastName, String gender, Integer age, String emailID, Long phoneNumber) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.emailID = emailID;
        this.phoneNumber = phoneNumber;
    }

    public userServices() {
    }
}
