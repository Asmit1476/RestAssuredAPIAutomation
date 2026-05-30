package Algorithms;

import java.util.Arrays;

public class LongestCommonPrefix_Solution2 {

    public static String longestCommonPrefix(String[] strs) {

        StringBuilder result = new StringBuilder();

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i=0;i<first.length();i++){

            if(first.charAt(i) != last.charAt(i)){
                break;
            }

            result.append(first.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] input = {"flower","flow","flight"};
        String output = longestCommonPrefix(input);
        System.out.println(output);
    }
}
