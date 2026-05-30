package Algorithms;

public class PrintAllSubstring {

    public static void powerSet (String str, int i, String current){

        if(i==str.length()){
            System.out.println("Test: "+current);
            return;
        }

        powerSet(str,i+1,current+str.charAt(i));
        powerSet(str,i+1,current);
    }

    public static void main(String[] args) {

        String str = "abc";
        String result="";
        powerSet(str,0,result);

    }
}
