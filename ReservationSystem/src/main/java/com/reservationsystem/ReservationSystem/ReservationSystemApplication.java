package com.reservationsystem.ReservationSystem;

import com.reservationsystem.ReservationSystem.model.User;
import com.reservationsystem.ReservationSystem.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReservationSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationSystemApplication.class, args);
	}

	@Bean
	public CommandLineRunner init(UserRepository userRepository) {
		return args -> {
			String defaultUsername = "admin";
			String defaultPassword = "admin123";

			if (userRepository.findByUsername(defaultUsername) == null) {
				User user = new User(defaultUsername, defaultPassword);
				userRepository.save(user);
				System.out.println("Default user 'admin' created.");
			} else {
				System.out.println("Default user 'admin' already exists.");
			}
		};
	}
}
