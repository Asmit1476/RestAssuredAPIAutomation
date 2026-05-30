package Algorithms;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CoinDCXCoding {

    public static void main(String[] args) {
        String[] expected = {"India", "US", "UK"};
        String[] actual = {"Japan", "UK", "France"};

        for (int i = 0; i < expected.length; i++) {
            for (int j = 0; j < actual.length; j++) {
                System.out.println("Test: "+expected[i]);
                if (actual[j].equals(expected[i])){
                    System.out.println("This value is  present: "+actual[j]);

                }else{
                    System.out.println("This value is not present: "+actual[j]);
                }
            }
        }

//        Date date = new Date();
//        //05 Sep 2022
//
//        System.out.println("Date is: "+date.getDate());
//        System.out.println("Month is "+date.getMonth());
//        System.out.println("Year is "+date.getYear());

        //{Vijay=90, Bob=55, Aman=79, Amit=75, Amy=88}

//        HashMap<String,Integer> map = new HashMap<String, Integer>();
//        map.put("Vijay",90);
//        map.put("Bob",55);
//        map.put("Aman",79);
//        map.put("Amit",75);
//        map.put("Amy",88);
//
//        int result= 0;
//        for(Map.Entry mp: map.entrySet()){
//            System.out.println("key is:"+ mp.getKey()+ " Value is: "+mp.getValue());
//
//
//            int marks = (int) mp.getValue();
//            String name= (String) mp.getKey();
//
//            ArrayList list = new ArrayList();
//            for(int i=0;i<map.size();i++){
//                list.add(mp.getValue());
//            }
//
//
//        }

    }
}
