package dsa;

public class BinarySearch {

    //order of the elements present in the array should be ascending order.
    // If elements are arranges in descending order then we need to tweak our code

    public static void main(String[] args) {


        int arr[] = {2, 4, 5, 8, 12, 13, 14};

        int target = 14;
        int index = binarySearch(arr, target);
        System.out.println("Index is : "+index );

    }

            public static int binarySearch(int arr[], int target){

            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {

                int mid = start + (end - start) / 2;

                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
}
