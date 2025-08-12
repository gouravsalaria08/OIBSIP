 # Guess the Number Game  

A fun **Java console-based game** where the player has to guess a randomly generated number within a limited number of attempts.  
This project was created as part of the **Oasis Infobyte Internship** to strengthen Java fundamentals.  

---

## Features  
-  **Multiple Rounds** – Play up to 3 rounds in one session.  
-  **Limited Attempts** – Maximum of 7 attempts per round.  
-  **Scoring System** – Earn more points by guessing in fewer tries.  
-  **Input Validation** – Ensures players enter valid integers.  
-  **Final Score Display** – See your total score at the end of the game.  

---

##  Tech Stack  
- **Language:** Java (Core)  
- **IDE:** IntelliJ IDEA / Eclipse  
- **Libraries:** `java.util.Random`, `java.util.Scanner`  

---

##  Project Structure  
GuessTheNumberGame.java
yaml
Copy
Edit
- **GuessTheNumberGame.java** – Contains the main game logic.

---

## 🚀 How to Run  
1. **Clone this repository**  
   ```bash
   git clone https://github.com/your-username/guess-the-number-game.git
Navigate to the project folder

cd guess-the-number-game
Compile the program

javac GuessTheNumberGame.java
Run the program

java GuessTheNumberGame
🎯 How to Play
The game will choose a random number between 1 and 100.

You have 7 attempts to guess the number in each round.

After each guess, you'll get hints:

Too low! → Try a higher number.

Too high! → Try a lower number.

If guessed correctly, you'll earn points based on the remaining attempts.

The game runs for 3 rounds, and your total score is shown at the end.

 Example Gameplay

Welcome to 'Guess the Number' Game!
Guess a number between 1 and 100
You have 7 attempts per round.
You will play 3 rounds.

Round 1 begins!
Enter your guess: 50
Too low!
Attempts left: 6
Enter your guess: 75
Too high!
Attempts left: 5
Enter your guess: 63
Correct! You've guessed the number.
You earned 5 points this round.
--------------------------------------
 Contributing
Feel free to fork this project, submit issues, or create pull requests to improve the game.
