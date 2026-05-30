package Algorithms.SlidingWindow;

/*
Input:
s = "havefunonleetcode"
k = 5

Output: 6
Explanation:
There are 6 substrings of length 5 with all distinct characters.
They are: "havef", "avefu", "vefun", "efuno", "funon", "onlee"



 */

import java.util.*;

public class CountDistinctKLengthSubstring {
    public static int countDistinctKLengthSubstring(String str, int k){

        Set<Character> set = new HashSet<>();
        int left = 0;
        int count = 0;

        for(int right=0; right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if(right - left+1 > k){
                set.remove(str.charAt(left));
                left++;
            }

            if(right - left+1 == k){
                count = count +1;
            }
        }

        return count;

    }

    public static List<List<Character>>  getAllDistinctKLengthSubstring(String str, int k){

        Set<Character> set = new HashSet<>();
        int left = 0;

        List<List<Character>> list = new ArrayList<>();

        for(int right=0; right<str.length();right++){
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));

            if(right - left+1 > k){
                set.remove(str.charAt(left));
                left++;
            }

            if(right - left+1 == k){
                list.add(new ArrayList<>(set));
            }
        }
        return list;

    }
    public static void main(String[] args) {
        String str = "havefunonleetcode";
        //String str = "homm";
        int k=4;
        int result = countDistinctKLengthSubstring(str,k);
        System.out.println("Result is: "+result);
        List<List<Character>> listResult = getAllDistinctKLengthSubstring(str,k);
        System.out.println("Result is: "+listResult);

    }

}
