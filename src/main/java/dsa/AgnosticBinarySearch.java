package dsa;

import java.util.Arrays;

public class AgnosticBinarySearch {

    //we don't if its arranged in ascending order or descending order

    public static void main(String[] args) {


        //int arr[] = {2, 4, 5, 8, 12, 13, 14};

        int arr[] = {21, 19, 18, 14, 10, 5, 4};

        // Line 1 to 3 is to sort the given array in ascending order
// 1.       int arr1[] = {21, 19, 18,22,23, 14, 10, 5, 4,90};
// 2.       Arrays.sort(arr1);
// 3.       System.out.println("Sorted Array is: "+Arrays.toString(arr1));

        int target = 5;
        int index = binarySearch(arr, target);
        System.out.println("Index is : "+index );

    }

    public static int binarySearch(int arr[], int target){


        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];


        while (start <= end) {

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;

            }

            if(isAsc){

                if (target < arr[mid]) {
                    start = mid - 1;
                }else {
                    end = mid + 1;
                }


            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
