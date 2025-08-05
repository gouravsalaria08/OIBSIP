import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {

    private static final int MAX_ATTEMPTS = 7;
    private static final int MAX_ROUNDS = 3;
    private static final int RANGE_START = 1;
    private static final int RANGE_END = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;

        System.out.println("🎯 Welcome to 'Guess the Number' Game!");
        System.out.println("Guess a number between " + RANGE_START + " and " + RANGE_END);
        System.out.println("You have " + MAX_ATTEMPTS + " attempts per round.");
        System.out.println("You will play " + MAX_ROUNDS + " rounds.\n");

        for (int round = 1; round <= MAX_ROUNDS; round++) {
            int targetNumber = random.nextInt(RANGE_END - RANGE_START + 1) + RANGE_START;
            int attemptsLeft = MAX_ATTEMPTS;
            boolean guessedCorrectly = false;

            System.out.println("🔁 Round " + round + " begins!");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess;

                // Input validation
                try {
                    userGuess = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Please enter a valid integer!");
                    continue;
                }

                attemptsLeft--;

                if (userGuess == targetNumber) {
                    System.out.println("✅ Correct! You've guessed the number.");
                    guessedCorrectly = true;
                    int pointsEarned = attemptsLeft + 1; // More points for fewer attempts
                    totalScore += pointsEarned;
                    System.out.println("🎉 You earned " + pointsEarned + " points this round.");
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("📉 Too low!");
                } else {
                    System.out.println("📈 Too high!");
                }

                if (attemptsLeft > 0) {
                    System.out.println("⏳ Attempts left: " + attemptsLeft);
                } else {
                    System.out.println("❌ Out of attempts! The number was: " + targetNumber);
                }
            }

            System.out.println("--------------------------------------");
        }

        System.out.println("🏁 Game Over! Your total score: " + totalScore + " points.");
        System.out.println("Thanks for playing! 👋");
        scanner.close();
    }
}
