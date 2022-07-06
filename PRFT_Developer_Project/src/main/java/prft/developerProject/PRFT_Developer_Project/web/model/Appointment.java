package prft.developerProject.PRFT_Developer_Project.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {
    private UUID userID;
    private UUID appointmentID;
    private String appointmentName;
    private String appointmentType;
    private String appointmentDescription;
    private String startTime;
    private String endTime;
    private String metaData;

}
