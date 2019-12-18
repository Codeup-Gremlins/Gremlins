package Bryan.password;

import java.util.Scanner;

public class PasswordStrength {
    public static void main(String[] args) {
        checkPW();
    }

    static Scanner scan = new Scanner(System.in);
    public static int score;
    public static boolean wantsToContinue = true;

    public static void checkPW() {
        while (wantsToContinue) {
            score = 0;
            System.out.println("Please enter a password to check");
            System.out.println("Passwords should be at least 8 characters long");
            System.out.println("Passwords should include at least ONE uppercase letter");
            System.out.println("Passwords should include at least ONE lowercase letter");
            System.out.println("Passwords should include at least ONE number");
            System.out.println("Passwords should include at least ONE special character");
            String inputPW = scan.nextLine();

            if (inputPW.length() < 8) {
                System.out.println("that password is not long enough, please try another");
                checkPW();
            } else if (inputPW.length() > 12) {
                score += 2;
            } else if (inputPW.length() > 8) {
                score += 1;
                System.out.println("thats good, but a password with at least 12 characters would be more secure");
            }

            //use matches and regular expressions to search for character types
            //if it contains digits
            if (inputPW.matches("(?=.*[0-9]).*")) {
                score += 1;
            } else {
                System.out.println("no numbers found");
            }

            //if it contains lower case letters
            if (inputPW.matches("(?=.*[a-z]).*")) {
                score += 1;
            } else {
                System.out.println("no lowercase letters found");
            }

            //if it contains upper case letters
            if (inputPW.matches("(?=.*[A-Z]).*")) {
                score += 1;
            } else {
                System.out.println("no uppercase letters found");
            }

            //if it contains special characters
            if (inputPW.matches("(?=.*[~!@#$%^&*()_><=+?.,/]).*")) {
                score += 1;
            } else {
                System.out.println("no special characters found");
            }

            System.out.println("password score = " + score + "/6");

            if (score < 4) {
                System.out.println("that's not a very secure password");
            }

            if (score == 4) {
                System.out.println("that's an ok password, but we'd recommend a stronger one");
            }

            if (score == 5) {
                System.out.println("that's a pretty secure password, but you can do better!");
            }

            if (score == 6) {
                System.out.println("that password is more secure than Fort Knox!");
            }

            System.out.println("do you want to check another password?\ny/n");
            String response = scan.nextLine();
            if (response.equalsIgnoreCase("y")) {
                wantsToContinue = true;
            } else {
                wantsToContinue = false;
            }

        }
    }

}
