package JavaConcepts.FilterRecords;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Filter_Records_Using_StreamAPI {
    public static void main(String[] args) {

        //Example-1
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Asmit",80);
        map.put("Aman",8);
        map.put("Rohit",10);
        map.put("Vishal",4);
        map.put("Grim",5);
        map.put("Kevin",93);
        map.put("Zack",50);

        Map<String,Integer> filteredMap = map.entrySet().stream().filter(x->x.getValue()>50).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println("Filtered map: " + filteredMap);

        // OR........................................
        map.entrySet().stream().filter(x->x.getValue()>50).forEach(System.out::println);

        //Example-2
        List<String> names = List.of("Alice", "Bob", "Charlie");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

        List<String> words = List.of("apple", "banana", "carrot");
        words.stream().map(str->str.length()).forEach(System.out::println);


    }
}
