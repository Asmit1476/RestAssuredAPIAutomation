package Algorithms;

import java.util.HashMap;
import java.util.Set;

public class GFG {
    public static boolean isAnagram(String a, String b)
    {
        if (a.length() != b.length()) {
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {

            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            }
            else {

                map.put(a.charAt(i), 1);
            }
        }
        // Now loop over String b
        for (int i = 0; i < b.length(); i++) {

            if (map.containsKey(b.charAt(i))) {

                map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        // Extract all keys of HashMap/map
        Set<Character> keys = map.keySet();
        // Loop over all keys and check if all keys are 0.
        // If so it means it is anagram.
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        // Returning True as all keys are zero
        return true;
    }
    public static void main(String[] args)
    {
        String str1 = "geeksforgeeks";
        String str2 = "forgeeksgeekssp";

        // Function call
        if (isAnagram(str1, str2))
            System.out.print("The two strings are "
                    + "anagram of each other");
        else
            System.out.print("The two strings are "
                    + "not anagram of each other");
    }
}
