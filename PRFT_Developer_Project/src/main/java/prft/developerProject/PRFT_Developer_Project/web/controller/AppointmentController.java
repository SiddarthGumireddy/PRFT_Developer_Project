package prft.developerProject.PRFT_Developer_Project.web.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prft.developerProject.PRFT_Developer_Project.services.AppointmentService;
import prft.developerProject.PRFT_Developer_Project.web.model.Appointment;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@RequestMapping("/api/v1/appointment")
@RestController
public class AppointmentController {
    private final AppointmentService appointmentService;
    List<String> allUsers = new ArrayList<String>();
    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @GetMapping({"/{appointmentID}"})
    public ResponseEntity<Appointment> getAppointment(@PathVariable("appointmentID") UUID appointmentID){
        return new ResponseEntity<>(appointmentService.getAppointmentByID(appointmentID), HttpStatus.OK);
    }

    public void listAppointments(List<String> allUsers){

        for (String eachUserID : allUsers){
            getAppointment(UUID.fromString(eachUserID));
        }
    }

    @PostMapping
    public ResponseEntity createAppointment(Appointment appointment){
        Appointment newAppt = appointmentService.saveNewAppointment(appointment);

        HttpHeaders httpHeaders =  new HttpHeaders();
        httpHeaders.add("Location", "/api/v1/appointment" + newAppt.getAppointmentID().toString());

        allUsers.add(newAppt.getAppointmentID().toString()); // adding user ID to allUsers

        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{appointmentID}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateAnAppointment(@PathVariable("appointmentID") UUID appointmentID, Appointment appointment, String apptValue, String apptKey){
        appointmentService.updateAppointment(appointmentID, appointment, apptValue, apptKey);
    }

    @DeleteMapping("/{appointmentID}")
    public void deleteAppointment(@PathVariable("appointmentID") UUID appointmentID){
        appointmentService.deleteByID(appointmentID);
    }


}


