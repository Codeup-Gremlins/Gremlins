package Kellsey_Week2;

import java.util.Scanner;

public class IsThereEnoughPie {
    public static boolean equalSlices(int total, int people, int each) {
        if(people * each <= total){
            System.out.println("There's enough pie for everyone!");

            return true;
        } else{
            System.out.println("Sadness, there's not enough for everyone to have " + each + " slices each.");
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many people are there?");
        int people = sc.nextInt();
        System.out.println("How many slices does everyone want?");
        int each = sc.nextInt();
        System.out.println("How many slices are there total?");
        int total = sc.nextInt();
        System.out.println(equalSlices(total, people, each));
    }
}
