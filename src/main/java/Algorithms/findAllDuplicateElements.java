package Algorithms;

import java.util.*;

public class findAllDuplicateElements {
    public static void main(String[] args) {
        int arr[] = {2,3,3,6,4,7,9,1,9,1};

        //Map<Integer,Integer> map = new HashMap<>(); // does not maintain insertion order
        Map<Integer,Integer> map = new LinkedHashMap<>(); // maintains insertion order
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }

        for(Map.Entry entry: map.entrySet()){
            int count = (int) entry.getValue();
            if(count>1){
                int key = (int) entry.getKey();
                list.add(key);
            }
        }
        System.out.println(list);
    }
}
