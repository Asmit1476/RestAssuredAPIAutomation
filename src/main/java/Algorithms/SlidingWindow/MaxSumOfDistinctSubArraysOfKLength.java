package Algorithms.SlidingWindow;

import java.util.HashSet;
import java.util.Set;

/*
You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

The length of the subarray is k, and
All the elements of the subarray are distinct.
Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,5,4,2,9,9,9], k = 3
Output: 15
Explanation: The subarrays of nums with length 3 are:
- [1,5,4] which meets the requirements and has a sum of 10.
- [5,4,2] which meets the requirements and has a sum of 11.
- [4,2,9] which meets the requirements and has a sum of 15.
- [2,9,9] which does not meet the requirements because the element 9 is repeated.
- [9,9,9] which does not meet the requirements because the element 9 is repeated.
We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions

Example 2:
Input: nums = [4,4,4], k = 3
Output: 0
Explanation: The subarrays of nums with length 3 are:
- [4,4,4] which does not meet the requirements because the element 4 is repeated.
We return 0 because no subarrays meet the conditions.
 */

public class MaxSumOfDistinctSubArraysOfKLength {
    public static long maximumSubArraySum(int[] nums, int k) {

        Set<Integer> set = new HashSet<Integer>();
        int left = 0;
        long sum = 0;
        long maxSum = 0;

        for(int right=0; right<nums.length; right++){

            while(set.contains(nums[right])){
                sum = sum - nums[left];
                set.remove(nums[left]);
                left++;
            }

            sum = sum + nums[right];
            set.add(nums[right]);

            if(right - left+1 > k){
                sum = sum - nums[left];
                set.remove(nums[left]);
                left++;
            }

            if(right - left+1 == k){
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;

    }

    public static long minimumSubArraySum(int[] nums, int k){

        int left =0;
        long sum = 0;
        long minSum = Integer.MAX_VALUE;

        Set<Integer> set = new HashSet<>();

        for(int right=0; right<nums.length;right++){

            while (set.contains(nums[right])){
                sum = sum - nums[left];
                set.remove(nums[left]);
                left++;
            }

            sum = sum + nums[right];
            set.add(nums[right]);

            if(right - left+1 > k){
                sum = sum - nums[left];
                set.remove(nums[left]);
                left++;
            }

            if(right - left+1 == k){
                minSum = Math.min(minSum,sum);
            }
        }

        return minSum;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
        long maxResult = maximumSubArraySum(nums,k);
        System.out.println("Max Sum is: "+maxResult);
        long minResult = minimumSubArraySum(nums,k);
        System.out.println("Min Sum is: "+minResult);
    }
}
