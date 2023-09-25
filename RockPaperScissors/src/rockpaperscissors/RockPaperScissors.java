package rockpaperscissors;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int roundsToWin = 2;
        boolean isPlaying = true;
        String input = "", wins = "", player = "", computer = "";

        do {
            System.out.println("Welcome to Rock, Paper, Scissors. Please choose an option:\n"
                    + "1. Start game\n"
                    + "2. Change number of rounds\n"
                    + "3. Exit application");

            input = s.nextLine();

            if (input.equalsIgnoreCase("start game") || input.equals("1")) {
                boolean isMoving = true, isChoosing = true;
                int cPoints = 0, pPoints = 0;
                    System.out.println("\nThis match will be first to " + roundsToWin + " wins.");
  do {
                    int random = (int) Math.floor(Math.random() * 3) + 1;

                    switch (random) {
                        case 1:
                            computer = "Rock";
                            break;
                        case 2:
                            computer = "Paper";
                            break;
                        default:
                            computer = "Scissors";
                            break;
                    }

                    System.out.println("The computer has selected its move. Select your move:\n"
                            + "1. Rock\n"
                            + "2. Paper\n"
                            + "3. Scissors");

                    isChoosing = true;
                    do {
                        player = s.nextLine();

                        if (player.equalsIgnoreCase("rock") || player.equals("1")) {
                            player = "Rock";
                            isChoosing = false;
                        } else if (player.equalsIgnoreCase("paper") || player.equals("2")) {
                            player = "Paper";
                            isChoosing = false;
                        } else if (player.equalsIgnoreCase("scissors") || player.equals("3")) {
                            player = "Scissors";
                            isChoosing = false;
                        } else {
                            System.out.println("\nInvalid input");
                        }
                    } while (isChoosing);

                    if (player.equals(computer)) {
                        System.out.println("\nPlayer chose " + player + ". Computer chose " + computer + ". Round is tied!");
                        System.out.println("Player: " + pPoints + " - Computer: " + cPoints);
                    } else if ((player.equals("Rock") && computer.equals("Scissors"))
                            || (player.equals("Scissors") && computer.equals("Paper"))
                            || (player.equals("Paper") && computer.equals("Rock"))) {
                        pPoints++;
                        System.out.println("\nPlayer chose " + player + ". Computer chose " + computer + ". Player wins round!");
                        System.out.println("Player: " + pPoints + " - Computer: " + cPoints);
                    } else {
                        cPoints++;
                        System.out.println("\nPlayer chose " + player + ". Computer chose " + computer + ". Computer wins round!");
                        System.out.println("Player: " + pPoints + " - Computer: " + cPoints);
                    }

                    if (cPoints == roundsToWin) {
                        System.out.println("\nComputer wins!");
                        isMoving = false;
                    } else if (pPoints == roundsToWin) {
                        System.out.println("\nPlayer wins!");
                        isMoving = false;
                    }
                } while (isMoving);
            } else if (input.equalsIgnoreCase("change number of rounds") || input.equals("2")) {
                boolean isWins = true;
                do {
                    System.out.println("\nHow many wins are needed to win a match?");
                    wins = s.nextLine();
                    roundsToWin = Integer.parseInt(wins);
                    if(roundsToWin > 0){
                        System.out.println("\nNew setting has been saved!");
                        isWins = false;
                    } else {
                        System.out.println("\nInvalid input");
                    }
                } while (isWins);
            } else if (input.equalsIgnoreCase("exit application") || input.equals("3")) {
                System.out.println("\nThank you for playing!");
                isPlaying = false;
            } else {
                System.out.println("\nInvalid Response.");
            }
        } while (isPlaying);

    }
}
