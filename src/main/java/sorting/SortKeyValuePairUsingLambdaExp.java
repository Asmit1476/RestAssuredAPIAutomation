package sorting;

import java.util.*;

public class SortKeyValuePairUsingLambdaExp {

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

        //Sort By Key
        Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));

        for(Map.Entry<String,Integer> entry: entries){
            System.out.println("Key is: "+entry.getKey()+ " Value is: "+entry.getValue());
        }

        System.out.println("=============================================================");

        //Sort By Value
        Collections.sort(entries,(o1,o2)->o1.getValue().compareTo(o2.getValue()));

        for(Map.Entry<String,Integer> entry: entries){
            System.out.println("Key is: "+entry.getKey()+ " Value is: "+entry.getValue());
        }

    }
}
