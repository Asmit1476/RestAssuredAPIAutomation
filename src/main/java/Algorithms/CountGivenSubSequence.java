package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//This is incorrect solution.

public class CountGivenSubSequence {

    public static List<String> powerSet (String str, int i, String current,ArrayList<String> list){

        //List<String> list = new ArrayList<>();

        if(i==str.length()){
            //System.out.println(current);

            list.add(current);

            return list;
        }


        //list.add(current);

        powerSet(str,i+1,current+str.charAt(i),list);
        powerSet(str,i+1,current,list);

        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();


        String str = "AABCCAAADCBBAADBBC";
        String result="";
        arr= (ArrayList<String>) powerSet(str,0,result,arr);
        //System.out.println("ArrayList is"+arr);

        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0; i<arr.size();i++){
            if(map.containsKey(arr.get(i))){
                map.put(arr.get(i),map.get(arr.get(i))+1);
            }else{
                map.put(arr.get(i),1);

            }

        }

        for(Map.Entry entry:map.entrySet()){
            //System.out.println("Key is: "+entry.getKey()+" Value is: "+entry.getValue());

            String output = (String)entry.getKey();

            if(output.equals("AA")){
                System.out.println("Latest Key is: "+entry.getKey()+" Latest Value is: "+entry.getValue());

            }


        }


    }
}
