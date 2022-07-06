package prft.developerProject.PRFT_Developer_Project.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import prft.developerProject.PRFT_Developer_Project.web.model.Appointment;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.UUID;
@Slf4j
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
                .startTime("now")
                .endTime("later")
                .metaData("none")
                .build();
    }

    @Override
    public Appointment saveNewAppointment(Appointment appointment) {
        return Appointment.builder()
                .appointmentID(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateAppointment(UUID appointmentID, Appointment appointment, String apptValue, String apptKey) {
        if (apptValue.equals("appointmentName")) {
            appointment.setAppointmentName(apptKey);
        }
        else if (apptValue.equals("appointmentType")) {
            appointment.setAppointmentType(apptKey);
        }
        else if (apptValue.equals("appointmentDescription")) {
            appointment.setAppointmentDescription(apptKey);
        }
        else if (apptValue.equals("startTime")) {
            appointment.setStartTime(apptKey);
        }
        else if (apptValue.equals("endTime")) {
            appointment.setEndTime(apptKey);
        }
        else if (apptValue.equals("metaData")) {
            appointment.setMetaData(apptKey);
        }
        else{
            log.debug("please enter valid attribute to update");
        }
    }

    @Override
    public void deleteByID(UUID appointmentID) {
        Appointment toDelete = getAppointmentByID(appointmentID);
        toDelete.setAppointmentID(null);
        toDelete.setUserID(null);
        toDelete.setAppointmentType(null);
        toDelete.setAppointmentName(null);
        toDelete.setAppointmentDescription(null);
        toDelete.setMetaData(null);
        toDelete.setStartTime(null);
        toDelete.setEndTime(null);
    }
}
