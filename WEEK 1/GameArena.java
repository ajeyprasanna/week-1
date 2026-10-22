import java.util.*;

public class GameArena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] playerMoves = new String[5];
        String[] computerMoves = new String[5];
        String[] results = new String[5];

        int wins = 0, losses = 0, draws = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Rock, Paper, or Scissors: ");
            playerMoves[i] = sc.next();

            computerMoves[i] = moves[random.nextInt(3)];

            String p = playerMoves[i].toLowerCase();
            String c = computerMoves[i].toLowerCase();

            if (p.equals(c)) {
                results[i] = "Draw";
                draws++;
            } else if (
                (p.equals("rock") && c.equals("scissors")) ||
                (p.equals("paper") && c.equals("rock")) ||
                (p.equals("scissors") && c.equals("paper"))
            ) {
                results[i] = "Player Wins";
                wins++;
            } else {
                results[i] = "Computer Wins";
                losses++;
            }
        }

        System.out.println("\nRound | Player | Computer | Result");

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " | " +
                playerMoves[i] + " | " +
                computerMoves[i] + " | " + results[i]);
        }

        double percentage = wins * 100.0 / 5;

        System.out.println("\nWins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.printf("Win Percentage: %.1f%%\n", percentage);

        sc.close();
    }
}