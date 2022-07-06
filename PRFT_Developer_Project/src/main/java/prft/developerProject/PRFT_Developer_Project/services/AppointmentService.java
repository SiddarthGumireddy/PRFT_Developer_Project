package prft.developerProject.PRFT_Developer_Project.services;

import prft.developerProject.PRFT_Developer_Project.web.model.Appointment;

import java.util.UUID;

public interface AppointmentService {
    Appointment getAppointmentByID(UUID appointmentID);
}
