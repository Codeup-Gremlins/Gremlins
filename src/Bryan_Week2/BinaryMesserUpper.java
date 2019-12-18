package Bryan_Week2;

import java.util.Arrays;



public class BinaryMesserUpper {

        public static void main(String[] args)
        {
            int arr[] = new int[]{ 1,0,0,1,1,0,0,0,1,0,1,0,1,1,0,0,1,0};
            int result[];
            System.out.println("Original Array ");
            System.out.println(Arrays.toString(arr));

            int n = arr.length;

            result = separate0and1(arr, n);
            System.out.println("New Array ");
            System.out.println(Arrays.toString(result));
        }

        static int [] separate0and1(int arr[], int n)
        {
            int count = 0;

//            increases count based on number of 0's in array
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0)
                    count++;
            }

//            changes each element, starting at index 0 and up to(not including) count to a 0
            for (int i = 0; i < count; i++)
                arr[i] = 0;

//            remaining elements up to arr.length(n) are converted to, and saved as 1's
            for (int i = count; i < n; i++)
                arr[i] = 1;

            return arr;
        }
    }

