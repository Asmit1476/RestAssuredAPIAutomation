package Algorithms;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        //print 2nd smallest number of array, Time Complexity should be O(n)
        int[] arr = {10,2,5,3,99,-1,-2,-2,-1};
        //int[] arr = {10, 2, 5, 3, 99, 4, 3, 4};
        //int[] arr = {10, 2, 5, 3, 99, 5, 5, 1, 1};

        int s_min = Integer.MAX_VALUE; //2nd smallest number
        int min = Integer.MAX_VALUE; //smallest number

        for(int i =0; i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        for(int i =0; i<arr.length;i++){
            if(arr[i]>min && arr[i]<s_min){
                s_min = arr[i];
            }
        }

        System.out.println("2nd smallest number is: "+s_min);
     }
}
