package Algorithms;

public class RemoveAdjacentDuplicateChars {

    public static String RemoveDuplicates(String str, int c){

        int count=1;
        String result="";

        for(int i=1; i<str.length();i++){

            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            }else{
                count=1;
            }

            if(count ==c){


                 result= str.substring(0,i-c+1) + str.substring(i+1);
                System.out.println("First result: "+result);
                return RemoveDuplicates(result,c);
            }

        }
        return str;
    }

    public static void main(String[] args) {

        String inputString = "bbcggttciiippooaais";
        int t=2;
        String output=RemoveDuplicates(inputString,t);
        System.out.println("Output is: "+output);
    }
}
