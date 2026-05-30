package Algorithms;

public class LongestCommonPrefix {

    public static String Longest_Common_Prefix(String[] str){

        if(str.length==0) return "";

        String prefix= str[0];

        System.out.println(str[1].indexOf(prefix));
        for(int i=1;i<str.length;i++){


            while(str[i].indexOf(prefix) !=0){

                prefix = prefix.substring(0,prefix.length()-1);


            }
        }
        return prefix;


    }
    public static void main(String[] args) {

        String[] input = {"Flower","Flow","Flight"};
        Longest_Common_Prefix(input);

    }
}
