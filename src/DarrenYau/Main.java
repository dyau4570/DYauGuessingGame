package DarrenYau;
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String player = name.nextLine();
        System.out.println("Hi, " + player + "" + "! Would you like to guess or have an AI guess? (Type guess to guess or type AI to make the AI guess)");
        String game = name.nextLine();
        if (game.equals("guess")) {
            System.out.println("Okay! Guess a number between 1 and 20!");
            int randomNum = (int) (20 * Math.random());
            int playerGuess = name.nextInt();
            boolean bool = false;
            while (!bool) {
                if (playerGuess == randomNum) {
                    System.out.println("Good job " + player + "! You guessed the right number!");
                    bool = true;
                } else if (playerGuess > 20 || playerGuess < 1) {
                    System.out.println("The number you guessed doesn't belong in the range! Try again!");
                    playerGuess = name.nextInt();
                } else {
                    System.out.println("Incorrect! Try again!");
                    playerGuess = name.nextInt();
                }
            }
        }
        else if (game.equals("AI")) {
            System.out.println(player + ", choose a number from 1 to 100 and I'll guess it!");
            int random100 = 50;
            int mid = random100/2;
            boolean bool = false;
            while (!bool) {
                System.out.println("My guess is " + random100 + ". Is it higher, lower, or correct?");
                String userInput = name.nextLine();
                if (userInput.equals("higher")) {
                    random100 += mid;
                    mid /= 2;
                }
                if (userInput.equals("lower")) {
                    random100 -= mid;
                    mid /= 2;
                }
                if (userInput.equals("correct")) {
                    System.out.println(player + ", the number is " + random100 + "!");
                    bool = true;
                }
            }
        }
    }
}