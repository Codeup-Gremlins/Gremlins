package Bryan_Week2;


import java.util.Arrays;

public class ArrayCommonElements {

    public static void main(String[] args) {
        int[] array1 = {3, 2, 17, 9, 88, 91, 19, 7, 41, 57};
        int[] array2 = {11, 7, 42, 64, 90, 33, 3, 12, 10, 99, 88 };

        System.out.println("Array1 : " + Arrays.toString(array1));
        System.out.println("Array2 : " + Arrays.toString(array2));


//        uses a nested foreach loop to compare each num of the first array to each num of the second array
//        if the num matches the other num a sout is generated for the matching num.
for(int num : array1){
    for(int OtherNum : array2) {
        if (num == OtherNum) {
            System.out.println(num + " is a common element!");
        }
    }
}

    }


}



