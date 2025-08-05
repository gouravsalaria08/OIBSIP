package com.reservationsystem.ReservationSystem.controller;

import com.reservationsystem.ReservationSystem.model.Cancellation;
import com.reservationsystem.ReservationSystem.model.Reservation;
import com.reservationsystem.ReservationSystem.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CancellationController {

    @Autowired
    private ReservationService reservationService;

@GetMapping("/cancellation")
    public String showCancellationForm(Model model) {
        model.addAttribute("cancellation", new Cancellation());
        return "cancellation";
    }


    @PostMapping("/cancellation")
    public String processCancellation(@RequestParam Long reservationId, Model model) {
        Reservation res = reservationService.getReservationById(reservationId);

        if (res != null) {
            model.addAttribute("reservation", res);
            return "confirm_cancel";
        } else {
            model.addAttribute("error", "Reservation not found for PNR: " + reservationId);
            return "cancellation";
        }
    }

    @PostMapping("/confirm-cancel")
    public String confirmCancellation(@RequestParam Long id) {
        reservationService.deleteReservation(id);
        return "cancel_success";
    }
}
