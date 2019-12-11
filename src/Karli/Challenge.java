
public class Challenge {
    public static void main(String[] args){

        System.out.println(multiplyWithLoop(1, 5));
        System.out.println(fractoral(4));

    }

    //multiply without *

    public static int multiplyWithLoop(int num1, int num2){
        int output = 0;
        for(int i = 0; i < num2; i++){
            output += num1;
        }
        return output;
    }



    public static long fractoral(int num){
        long output = 1;
        for(int i = 1; i <= num; i++){
            output *= i;
        }
        return output;
    }


}
