package Kellsey_Week2;

import java.util.Scanner;

public class FarmProblem {
        public static int animals(int chickens, int cows, int pigs) {
            chickens = chickens * 2;
            cows = cows * 4;
            pigs = pigs * 4;

            return chickens + cows + pigs;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Chickens do you have?");
        int chickens = sc.nextInt();
        System.out.println("How many Cows do you have?");
        int cows = sc.nextInt();
        System.out.println("How many Pigs do you have?");
        int pigs = sc.nextInt();
        System.out.println("You have " + animals(chickens,cows,pigs) + " legs in total");
    }

}
