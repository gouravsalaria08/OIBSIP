package com.reservationsystem.ReservationSystem.repository;

import com.reservationsystem.ReservationSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
