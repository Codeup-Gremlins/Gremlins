package Bryan.numberConverter;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
//getBinary();
getHex();

    }

    static Scanner scan = new Scanner(System.in);
    static int num;

    public static double getBinary() {
        System.out.println("enter a number\n");
        String input = scan.nextLine();
        try {
            num = Integer.valueOf(input, 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }


    public static double getHex() {
        System.out.println("enter a number\n");
        String input = scan.nextLine();
        try {
            num = Integer.valueOf(input, 16);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(num);
        return num;
    }
}
