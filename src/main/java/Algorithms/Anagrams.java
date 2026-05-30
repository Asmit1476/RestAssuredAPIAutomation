package Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "aacc";
        String str2 = "ccaa";
        boolean result = isAnagram(str1,str2);
        System.out.println(result);

    }

    public static boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        if(ch1.length != ch2.length){
            return false;
        }

        for(int i=0; i<ch1.length; i++){
            if(map.containsKey(ch1[i])){
                map.put(ch1[i], map.get(ch1[i])+1);
            }else{
                map.put(ch1[i],1);
            }
        }

        for(int i=0; i<ch2.length;i++){
            if(map.containsKey(ch2[i])){
                map.put(ch2[i], map.get(ch2[i])-1);
            }
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            int count = entry.getValue();

            if(count !=0){
                return false;
            }
        }

        return true;
    }
}
