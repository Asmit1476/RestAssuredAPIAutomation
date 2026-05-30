package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencey {

    public static void main(String[] args) {
        String str = "idiottmm";
        int num=0;
        char ch[] = str.toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<ch.length;i++){

            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }else{
                map.put(ch[i],1);
            }
        }

        for (Map.Entry entry : map.entrySet()) {

            System.out.println(entry.getKey() + "=>" + entry.getValue());
            int count = (int) entry.getValue();

            if(count>1){
                num++;
            }
        }
        System.out.println("Number is: "+num);
    }

}
