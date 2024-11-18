package Task.Nov;

import java.util.Arrays;

public class Nov15_Task1 {
    public static void main(String[] args) {
        //int [] a = {1,3,4,5,2,2,3,4,6,7};
        int[] arr = {1,3,4,5,2,2,3,4,6,7};

        // Sort the array
        Arrays.sort(arr);

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " -> " + count);
                count = 1;
            }
        }

        // Print the frequency of the last element
        System.out.println(arr[arr.length - 1] + " -> " + count);
    }
}
