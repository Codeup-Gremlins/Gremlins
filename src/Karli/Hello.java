public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Karli");


        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myMaxInt = Integer.MAX_VALUE;
        int myMinInt = Integer.MIN_VALUE;
        System.out.println("My min int value is " + myMinInt);
        System.out.println("My max int value is " + myMaxInt);

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

        byte myFirstByte = (10 + 3) - (10 - 4);
        byte myMaxByte = Byte.MAX_VALUE;
        byte myMinByte = Byte.MIN_VALUE;
        System.out.println("Max value of byte is " + myMaxByte);
        System.out.println("Min value of byte is " + myMinByte);
        System.out.println("The result of myFirstByte is " + myFirstByte);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        short myFirstShort = 100;
        short mySecondShort = 10303;
        System.out.println("The min value of short is " + myMinShortValue);
        System.out.println("The max value of short is " + myMaxShortValue);

        double myMinDoubleValue = Short.MIN_VALUE;
        double myMaxDoubleValue = Short.MAX_VALUE;
        double myFirstDouble = 100;
        double mySecondDouble = 10303;
        System.out.println("The min value of double is " + myMinDoubleValue);
        System.out.println("The max value of double is " + myMaxDoubleValue);


        float myMinFLoatVal = Float.MIN_VALUE;
        float myMaxFloatVal = Float.MAX_VALUE;
        System.out.println("my min float is " +myMinFLoatVal);
        System.out.println("my max float is " +myMaxFloatVal);

        int myIntVal = 5;
        float myFloatVal = 5.35f;
        double myDoubleVal = 5d;

        //you'll usually want to put an F or D at the end of nums to name them

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        long myFirstLong = 100L;
        System.out.println("The min value of long is " + myMinLongValue);
        System.out.println("The max value of long is " + myMaxLongValue);


        int myNewTotal = (myMinInt / 2);
        byte myNewByteValue = (byte) (myMinByte / 2);

        short myNewShortVal = (short) (myMinShortValue / 2);
        //you need to put an L at the end of your long so java will convert it from int to long
    }
}



