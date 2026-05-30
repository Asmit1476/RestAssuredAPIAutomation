package sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class SortKeyValueUsingStreamAPI {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Asmit",80);
        map.put("Aman",8);
        map.put("Rohit",10);
        map.put("Vishal",4);
        map.put("Grim",5);
        map.put("Kevin",23);
        map.put("Zack",50);

        //Sort Key in Ascending order
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("*****************************************************************");

        //Sort Value in Ascending order
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        System.out.println("*****************************************************************");

        //Sort Key in Descending Order
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

        System.out.println("*****************************************************************");

        //Sort Value in Descending Order
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);


    }
}
