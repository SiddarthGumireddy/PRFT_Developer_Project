package prft.developerProject.PRFT_Developer_Project.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class manageApptsServices {
    private UUID userID;
    private UUID appointmentID;
    private String appointmentName;
    private String appointmentType;
    private String appointmentDescription;
    private Timestamp startTime;
    private Timestamp endTime;
    private String metaData;

}
