package Algorithms;

import java.util.Arrays;

public class SmallestFirstMissingPositiveNumber {

    public static void main(String[] args) {

        int[] arr = {7, -9, 5, 11,1, 2, 3, -10, 7};

        Arrays.sort(arr);

        int missing = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == missing) {
                missing++;
            }
        }

        System.out.println(missing);
    }
}
