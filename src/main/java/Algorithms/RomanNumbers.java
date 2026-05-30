package Algorithms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the roman number");
        String str = scan.nextLine();


        int result=0;

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        map.put('i',1);
        map.put('v',5);
        map.put('x',10);
        map.put('l',50);
        map.put('c',100);
        map.put('d',500);
        map.put('m',1000);



        for(int i=0; i<str.length();i++){

            if(i>0 && map.get(str.charAt(i))> map.get(str.charAt(i-1))){
                System.out.println("Test: "+map.get(str.charAt(i)));
                result += map.get(str.charAt(i)) - 2*map.get(str.charAt(i-1));
            }else{
                System.out.println("Test: "+map.get(str.charAt(i)));
                result += map.get(str.charAt(i));
            }


        }
        System.out.println("Answer is: "+result);




    }

    }

