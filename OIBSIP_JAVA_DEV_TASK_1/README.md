# 🚆 Online Train Reservation System

An **Online Train Reservation System** built using **Java, Spring Boot, JSP, and MySQL**.  
This project streamlines train ticket booking, cancellation, and passenger management by storing all details in a **centralized database**, accessible only by authorized users.

---

## 📌 Features

- **🔑 Login Module**
  - Only authorized users can log in using a valid ID and password.
  
- **🎟 Reservation Module**
  - Fill in passenger details such as:
    - Name, Age, Contact
    - Train Number (auto-fetch Train Name)
    - Class Type, Journey Date
    - Source & Destination
  - Insert and store data into the database.

- **❌ Cancellation Module**
  - Cancel tickets using a valid PNR number.
  - Displays complete booking details before confirmation.

---

## 🛠 Tech Stack

- **Backend:** Java, Spring Boot
- **Frontend:** JSP, HTML, CSS
- **Database:** H2
- **JPA:** For database connectivity

---

## 📂 Project Structure

/src
├── controller/ # Handles requests & responses
├── model/ # Entity classes
├── repository/ # Data access logic
├── service/ # Business logic
└── webapp/ # JSP pages


---

## 🚀 How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/online-reservation-system.git
2. **Open in IDE**
Import the project in IntelliJ IDEA / Eclipse.

3. **Run the Application**
Start the Spring Boot application.
Access via: http://localhost:8080
