package Bryan_Week2;


public class ArrayCommonElements {

    public static void main(String[] args) {
        int[] array1 = {3, 2, 17, 9, 88, 91, 19, 7, 41, 57};
        int[] array2 = {11, 7, 42, 64, 90, 33, 3, 12, 10, 99, 88 };

        System.out.println("Array1 : " + ArrayCommonElements.toString(array1));
        System.out.println("Array2 : " + ArrayCommonElements.toString(array2));

for(int num : array1){
    for(int OtherNum : array2) {
        if (num == OtherNum) {
            System.out.println(num + " is a common element!");
        }
    }
}

    }

    private static String toString(int[] array) {
        String str = "[";
        for (int num : array) {
            str += " " + num + ",";
        }
        str += "]";
        return str;
    }
}



