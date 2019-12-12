package Bryan.numberConverter;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {
        convertNum();

//        getBinary();

//        getHex();
    }

   static int num;
    static Scanner scan = new Scanner(System.in);


    //converts base 10 into binary, octal, and hexadecimal values using built in java classes
    public static void convertNum() {
        System.out.println("enter a number to convert");
        int userNum = scan.nextInt();
        System.out.println("Binary eqivalent of " + userNum + " = " + Integer.toString(userNum, 2));
        System.out.println("Octal eqivalent of " + userNum + " = " + Integer.toString(userNum, 8));
        System.out.println("Hexadecimal eqivalent of " + userNum + " = " + Integer.toString(userNum, 16));
    }

}
