package Algorithms.BoyerMooreVotingAlgorithm;

public class MajorityElement {
    // In this we will keep a element variable as 0 and keep the count as 0 initially
    // then initially count will be always zero hence we will assign first element of array to the element variable and increase its count by 1
    // then we will check if the next element is equal to element variable then we will increase its count
    //else we will decrease its count because at the end count should not be 0 if the count is 0 then again we will assign next array index element in the element variable
//https://www.youtube.com/watch?v=nP_ns3uSh80
    //https://leetcode.com/problems/majority-element/description/

    public static int majorityElement(int[] nums) {
        int ele =0;
        int count = 0;

        for(int i=0; i< nums.length; i++){
            if(count == 0){
                count= 1;
                ele = nums[i];
            }else if(nums[i]==ele){
                count++;
            }else{
                count--;
            }
        }
        //scans the array to check if the majority element satisfies the n/2
        int cnt = 0;
        for(int i=0; i<nums.length;i++){
            if(ele == nums[i]){
                cnt++;
            }
            if(cnt > nums.length/2){
                return ele;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        System.out.println("Element is: "+majorityElement(arr));
    }

}
