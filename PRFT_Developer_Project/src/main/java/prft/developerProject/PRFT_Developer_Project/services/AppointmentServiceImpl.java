package prft.developerProject.PRFT_Developer_Project.services;

import org.springframework.stereotype.Service;
import prft.developerProject.PRFT_Developer_Project.web.model.Appointment;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;
@Service
public class AppointmentServiceImpl implements AppointmentService {
    @Override
    public Appointment getAppointmentByID(UUID appointmentID) {
        return Appointment.builder()
                .appointmentID(UUID.randomUUID())
                .userID(UUID.randomUUID())
                .appointmentName("Sid")
                .appointmentType("Dental")
                .appointmentDescription("Dr.Smith")
                .startTime(Timestamp.from(Instant.now()))
                .endTime(Timestamp.from(Instant.now()))
                .metaData("none")
                .build();
    }
}
