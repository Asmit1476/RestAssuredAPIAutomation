package Test;

import java.util.HashMap;
import java.util.Map;

public class BigBucket {

    //opportunity
    public static void main(String[] args) {
        String str = "opportunity";
        char ch[] = str.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<ch.length;i++){

            if(map.containsKey(ch[i])){

                map.put(ch[i],map.get(ch[i])+1);
            }else{
                map.put(ch[i],1);
            }
        }
//
//        for(Map.Entry<Character,Integer> ele:map.entrySet()){
//
//           // System.out.println("Key is: "+ele.getKey()+" Value is: "+ele.getValue());
//
//            int count = ele.getValue();
//
//            if(count>1){
//                System.out.println("Key is: "+ele.getKey()+" Value is: "+ele.getValue());
//            }
//        }

        for(char key:map.keySet()){
            int value = map.get(key);
            System.out.println(key+" "+value);
        }
    }
}
