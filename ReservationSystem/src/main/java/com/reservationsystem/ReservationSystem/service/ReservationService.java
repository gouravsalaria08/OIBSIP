package com.reservationsystem.ReservationSystem.service;

import com.reservationsystem.ReservationSystem.model.Reservation;
import com.reservationsystem.ReservationSystem.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public Reservation saveReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public void deleteReservation(Long id) {
        reservationRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return reservationRepository.existsById(id);
    }

    // ✅ This is the missing method
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
