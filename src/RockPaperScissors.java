import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Player A, enter your move (R, P, S):");
            String playerA = scanner.next().toUpperCase();

            while (!playerA.equals("R") && !playerA.equals("P") && !playerA.equals("S")) {
                System.out.println("Invalid move, try again:");
                playerA = scanner.next().toUpperCase();
            }

            System.out.println("Player B, enter your move (R, P, S):");
            String playerB = scanner.next().toUpperCase();

            while (!playerB.equals("R") && !playerB.equals("P") && !playerB.equals("S")) {
                System.out.println("Invalid move, try again:");
                playerB = scanner.next().toUpperCase();
            }

            System.out.println("Result:");

            if (playerA.equals(playerB)) {
                System.out.println("It's a tie!");
            } else if ((playerA.equals("R") && playerB.equals("S")) ||
                    (playerA.equals("P") && playerB.equals("R")) ||
                    (playerA.equals("S") && playerB.equals("P"))) {
                System.out.println("Player A wins!");
            } else {
                System.out.println("Player B wins!");
            }

            System.out.println("Play again? (Y/N)");
            String playAgain = scanner.next().toUpperCase();

            if (playAgain.equals("N")) {
                break;
            }
        }
    }
}