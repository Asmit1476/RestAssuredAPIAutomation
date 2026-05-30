package Test;

import java.util.HashMap;
import java.util.Map;

public class Test12345 {

//    count the number of words in a string using HashMap.
//    i/p: "Selenium Java Git Jenkins TestNG Java Jenkins";
//    o/p: Selenium=1, Java=2, Jenkins=2, TestNg=1

    public static void main(String[] args) {

        String str = "Selenium Java Git Jenkins TestNG Java Jenkins";
        String words[] = str.split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){

                map.put(words[i],map.get(words[i])+1);
            }else {
                map.put(words[i],1);
            }
        }

        for(Map.Entry entry: map.entrySet()){

            System.out.println("Key is: "+entry.getKey() +"== "+"Value is: "+entry.getValue());
        }

    }
}
