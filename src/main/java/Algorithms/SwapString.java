package Algorithms;

public class SwapString {

    public static void main(String[] args) {

        String str1 = "Youtube"; //7
        String str2 = "World"; //5

        str1 = str1 +str2; //12

        str2 = str1.substring(0,str1.length()-str2.length());

        str1 = str1.substring(str2.length());

        System.out.println("#String 1: "+str1+" #String 2: "+str2);
    }
}
