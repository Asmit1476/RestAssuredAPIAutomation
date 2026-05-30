package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class countOfDuplicateWord {
    public static void main(String[] args) {
        //String str = "idiot";
        //String ch[] = {"asmit", "anand", "asmit","rohit","rohit"};
        String str= "My name is Asmit Asmit";
        String ch[] = str.split(" ");
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Enter the name");
       // String str = scan.nextLine();
//        ArrayList<String> ch = new ArrayList<String>(3);
//        for(int i=0;i<3;i++){
//            System.out.println("Enter the name");
//            //str = scan.nextLine();
//            //ch.add(str);
//            ch.add(scan.nextLine());
//        }

        HashMap<String,Integer> map = new HashMap<String,Integer>();

        for(int i=0; i<ch.length;i++){
            if(map.containsKey(ch[i]))
            {
                map.put(ch[i],map.get(ch[i])+1);
            }else{
                map.put(ch[i],1);
            }
        }

        for(Map.Entry m :map.entrySet()){

            int num= (int)m.getValue();
            if(num > 1){
                System.out.println("Key is: "+m.getKey()+ " Value is: "+m.getValue());
            }
        }
    }
}