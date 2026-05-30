package Test;

import java.util.HashMap;
import java.util.Map;

public class Test3 {

    public static void main(String[] args) {

        String str = "asmitat19@gmail.com";
        char[] ch = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<ch.length;i++){

            if(map.containsKey(ch[i])){

                map.put(ch[i],map.get(ch[i])+1);
            }else{
                map.put(ch[i],1);
            }


        }

        for(Map.Entry entry: map.entrySet()){

            System.out.println("Key is: "+entry.getKey()+ " Value is: "+entry.getValue());

        }


    }
}
