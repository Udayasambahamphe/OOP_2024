import java.util.Scanner;
import java.util.Random;

public class ScissorsPaperRock {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        String[] options = { "R", "P", "S" };
        System.out.println("Enter your choice (R - Rock, P - Paper, S - Scissors):");
        String personPlay = scan.next().toUpperCase();

        if (!personPlay.equals("R") && !personPlay.equals("P") && !personPlay.equals("S")) {
            System.out.println("Invalid input. Please enter R, P, or S.");
            return;
        }

        int computerIndex = generator.nextInt(options.length);
        String Botplay = options[computerIndex];

        System.out.println("Bot plays: " + Botplay);

        switch (personPlay) {
            case "R":
                if (Botplay.equals("S")) {
                    System.out.println(" You win!");
                } else if (Botplay.equals("P")) {
                    System.out.println("You lose!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;

            case "P":
                if (Botplay.equals("R")) {
                    System.out.println("You win!");
                } else if (Botplay.equals("S")) {
                    System.out.println("You lose!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;

            case "S":
                if (Botplay.equals("P")) {
                    System.out.println("You win!");
                } else if (Botplay.equals("R")) {
                    System.out.println("You lose!");
                } else {
                    System.out.println("It's a tie!");
                }
                break;
        }
    }
}