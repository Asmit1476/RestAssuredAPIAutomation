package Algorithms;

public class MaxSum_Of_ContiguousSubArray {
    public static void main(String[] args) {


        int arr[] = {1,2,-1,-2,2,1,-2,1,4,-5,4};


        int maxSum = arr[0];
        int sum = arr[0];

        //Traverse an array
        for(int i = 1; i < arr.length; i++) {

            if(sum < 0) {
                sum = arr[i];
            } else {
                sum = sum + arr[i];
            }

            //get maxsum
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println(maxSum);


    }
}


