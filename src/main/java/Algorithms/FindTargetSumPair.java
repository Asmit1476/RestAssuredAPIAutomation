package Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTargetSumPair {
    public static void findPair(int[] nums, int target)
    {
        // create an empty HashMap
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;


        // do for each element
        for (int i = 0; i < nums.length; i++)
        {
            // check if pair (nums[i], target-nums[i]) exists

            // if the difference is seen before, print the pair
            if (map.containsKey(target - nums[i]))
            {
                //System.out.println("Difference is : "+(target - nums[i]));
                //System.out.println("After using get: "+map.get(target - nums[i]));
                System.out.printf("Pair found (%d, %d)", nums[map.get(target - nums[i])], nums[i]);
                System.out.println(map.get(target - nums[i])+" "+i);

                //or
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                System.out.println("Pair is: "+ Arrays.toString(ans));

                return;
            }

            // store index of the current element in the map
            map.put(nums[i], i);
        }

        // we reach here if the pair is not found
        System.out.println("Pair not found");
    }

    public static void main (String[] args)
    {
        //int[] nums = { 8, 7, 2, 5, 3, 1 };
        int[] nums = { 2,5,7,9,11 };
        int target = 14;

        findPair(nums, target);
    }
}
