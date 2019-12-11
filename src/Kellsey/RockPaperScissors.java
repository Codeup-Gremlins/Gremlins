package Kellsey;

import java.util.Scanner;

public class RockPaperScissors {
    static int yourWins = 0;
    static int compWins = 0;
    static int ties = 0;
    static String userHand = null;
    static String compHand = null;

    static Scanner sc = new Scanner(System.in);

    static double compNum = Math.floor(Math.random()* 3 )+1;


    public static void main(String[] args) {

            System.out.printf("Welcome to the game of rock, paper, scissors%n");
        while (yourWins < 15) {
            System.out.printf("You: %d | Computer: %d | Ties: %d%n", yourWins, compWins, ties);
            System.out.printf("Pick the number corresponding with the choice you want.%n");
            System.out.printf("1. Rock%n2. Paper%n3. Scissors%n");


            if (compNum == 1) {
                compHand = "Rock";
            } else if (compNum == 2) {
                compHand = "Paper";
            } else if (compNum == 3) {
                compHand = "Scissors";
            }

            int userNum = sc.nextInt();
            switch (userNum) {
                case 1:
                    userHand = "Rock";
                    System.out.printf("You chose Rock, the computer chose %s%n", compHand);
                    if (compHand.equalsIgnoreCase("Rock")) {
                        System.out.println("It's a tie!");
                        ties++;
                    } else if (compHand.equalsIgnoreCase("Paper")) {
                        System.out.println("Computer Wins!");
                        compWins++;
                    } else if (compHand.equalsIgnoreCase("Scissors")) {
                        System.out.println("You win!");
                        yourWins++;
                    }
                    break;
                case 2:
                    userHand = "Paper";
                    System.out.printf("You chose Paper, the computer chose %s%n", compHand);
                    if (compHand.equalsIgnoreCase("Rock")) {
                        System.out.println("You Win!");
                        yourWins++;
                    } else if (compHand.equalsIgnoreCase("Paper")) {
                        System.out.println("It's a tie!");
                        ties++;
                    } else if (compHand.equalsIgnoreCase("Scissors")) {
                        System.out.println("Computer Wins!");
                        compWins++;
                    }
                    break;
                case 3:
                    userHand = "Scissors";
                    System.out.printf("You chose scissors, the computer chose %s%n", compHand);
                    if (compHand.equalsIgnoreCase("Rock")) {
                        System.out.println("Computer Wins!");
                        compWins++;
                    } else if (compHand.equalsIgnoreCase("Paper")) {
                        System.out.println("You Win!");
                        yourWins++;
                    } else if (compHand.equalsIgnoreCase("Scissors")) {
                        System.out.println("It's a tie!");
                        ties++;
                    }
                    break;
                default:
                    System.out.println("Not a valid input");
            }

        }
    }
}