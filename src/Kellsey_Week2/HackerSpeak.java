package Kellsey_Week2;

import java.util.Scanner;

public class HackerSpeak {

    public static String hackerSpeak(String str) {
        str = str.replace("a", "4");
        str = str.replace("e", "3");
        str = str.replace("i", "1");
        str = str.replace("o", "0");
        str = str.replace("s", "5");
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type a sentence to get hacky");
        String input = sc.nextLine();
        System.out.println(hackerSpeak(input));
    }




}
