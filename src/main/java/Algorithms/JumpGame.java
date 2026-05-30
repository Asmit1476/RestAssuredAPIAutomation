package Algorithms;

public class JumpGame {
    public static void main(String[] args) {
        //usecase 2 - {1,1,2,3,2,1,0,0,3};
        int nums[] = {1,1,2,5,2,1,0,0,3};
        boolean jumpGameAnswer = canJump(nums);
        System.out.println(jumpGameAnswer);
    }
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int reachable = 0;

        for(int i=0;i<n;i++){
            if(reachable < i)
                return false;
            reachable = Math.max(reachable, i+nums[i]);
        }
        return true;
    }
}
