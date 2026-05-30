package sorting;

import java.util.*;
import java.util.Map.Entry;

public class SortKeyValueOfMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Asmit",80);
        map.put("Aman",8);
        map.put("Rohit",10);
        map.put("Vishal",4);
        map.put("Grim",5);
        map.put("Kevin",23);
        map.put("Zack",50);

        List<Map.Entry<String,Integer>> entries = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());



//Sort by Key
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });


        for(Map.Entry<String,Integer> entry: entries){
            System.out.println("Key is: "+entry.getKey()+ " Value is: "+entry.getValue());
        }


// Sort by Value
       Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {
           @Override
           public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o1.getValue().compareTo(o2.getValue());
           }
       });

        for(Map.Entry<String,Integer> entry: entries){
            System.out.println("Key is: "+entry.getKey()+ " Value is: "+entry.getValue());
        }


    }
}
