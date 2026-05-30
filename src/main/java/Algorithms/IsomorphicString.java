package Algorithms;

import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        String str1 = "boo";
        String str2 = "foo";
        boolean result = isIsomorphic(str1,str2);
        if(result){
            System.out.println("String is Isomorphic");
        }else{
            System.out.println("String is not Isomorphic");
        }
    }
    public static boolean isIsomorphic(String str1, String str2){
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        for(int i=0; i<ch1.length; i++){

           if(!map.containsKey(ch1[i]) && !map.containsValue(ch2[i])){
               map.put(ch1[i],ch2[i]);
           }else if(!map.containsKey(ch1[i]) && map.containsValue(ch2[i])){
               return false;
           }else if(map.containsKey(ch1[i]) && map.get(ch1[i])!= ch2[i]){
               return false;
           }
        }
return true;
    }
}
