package Kellsey;
import java.util.Scanner;


public class LeapYear {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean userContinue = true;
        while (userContinue) {
            System.out.println("Enter a year to see if it is a leap year!");
            double year = sc.nextDouble();

            if (year == 2020) {
                System.out.println("That's definitely a leap year because I will FINALLY have my first anniversary");
            } else if (year % 400 == 0) {
                System.out.println("That is indeed a leap year!");
            } else if (year % 4 == 0) {
                System.out.println("That is indeed a leap year");
            } else {
                System.out.println("Sorry! That's not a leap year");
            }

            System.out.println("would you like to try again?");
            String input = sc.next();
//<<<<<<< HEAD
////            String input = sc.nextLine();
//=======
//>>>>>>> 8155ea42689683f9eeb1b88e38295057d305dac1
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                System.out.println("ok let's try again!");
            } else {
                userContinue = false;
            }
        }
    }
}
