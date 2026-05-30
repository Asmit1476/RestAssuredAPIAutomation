package Algorithms.Kadanes_Algorithm;

import Test.Inter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MaximumSubArraySum {
    //https://leetcode.com/problems/maximum-subarray/description/?utm_source=chatgpt.com

    public int maxSumArraySum(int arr[]){
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for(int i=0; i< arr.length;i++){
            sum = sum + arr[i];

            if(sum>max_sum){
                max_sum = sum;
            }
            if(sum < 0){
                sum =0;
            }
        }
        return max_sum;
    }

    public LinkedList<Integer> printMaxSumSubArray(int arr[]){
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int start = 0;
        int end =0;
        int tempStart = 0;

        for(int i=0; i< arr.length;i++){
            sum = sum + arr[i];

            if(sum>max_sum){
                max_sum = sum;
                start = tempStart;
                end = i;
            }
            if(sum < 0){
                sum =0;
                tempStart = i + 1;
            }
        }
        LinkedList<Integer> list = new LinkedList<>();
        for(int i= start; i<=end; i++){
            list.add(arr[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4}; //The subarray [4,-1,2,1] has the largest sum 6.
        MaximumSubArraySum max = new MaximumSubArraySum();
        int result = max.maxSumArraySum(arr);

        System.out.println("Maximum Sub Array Sum is: "+result);

        LinkedList<Integer> list = max.printMaxSumSubArray(arr);
        System.out.println("Max Sum array list is :"+list);
    }
}
