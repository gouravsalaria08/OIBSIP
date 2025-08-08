package com.reservationsystem.ReservationSystem.repository;

import com.reservationsystem.ReservationSystem.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
