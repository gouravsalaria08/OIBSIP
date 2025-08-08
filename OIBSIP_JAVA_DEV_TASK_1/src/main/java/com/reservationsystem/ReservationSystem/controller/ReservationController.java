package com.reservationsystem.ReservationSystem.controller;

import com.reservationsystem.ReservationSystem.model.Reservation;
import com.reservationsystem.ReservationSystem.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ReservationController {

    @Autowired
    private ReservationService reservationService;


    @GetMapping("/reservation")
    public String showForm(Model model) {
        model.addAttribute("reservation", new Reservation());
        return "reservation";
    }


    @PostMapping("/reservation")
    public String saveReservation(@ModelAttribute Reservation reservation, Model model) {
        Reservation savedReservation = reservationService.saveReservation(reservation);
        model.addAttribute("reservationId", savedReservation.getId());
        return "success";
    }


    @GetMapping("/all-reservations")
    public String showAllReservations(Model model) {
        List<Reservation> reservations = reservationService.getAllReservations();
        model.addAttribute("reservations", reservations);
        return "all_reservations";
    }
    

    @PostMapping("/cancel")
    public String cancelReservation(@RequestParam("pnr") Long id, Model model) {
        boolean exists = reservationService.existsById(id);
        if (exists) {
            reservationService.deleteReservation(id);
            model.addAttribute("message", " Reservation with PNR " + id + " has been cancelled.");
        } else {
            model.addAttribute("message", " No reservation found with PNR " + id);
        }
        return "cancellation";
    }
}
