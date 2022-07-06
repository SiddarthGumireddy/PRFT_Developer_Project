package prft.developerProject.PRFT_Developer_Project.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prft.developerProject.PRFT_Developer_Project.services.AppointmentService;
import prft.developerProject.PRFT_Developer_Project.web.model.Appointment;

import java.util.UUID;


@RequestMapping("api/v1/appointment")
@RestController
public class AppointmentContoller {

    private AppointmentService appointmentService;

    public AppointmentContoller(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping("/{appointmentID}")
    public ResponseEntity<Appointment> getAppointment(@PathVariable("appointmentID") UUID appointmentID){
        return new ResponseEntity<>(appointmentService.getAppointmentByID(appointmentID), HttpStatus.OK);
    }
}
