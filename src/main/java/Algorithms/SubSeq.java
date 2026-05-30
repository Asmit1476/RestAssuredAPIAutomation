package Algorithms;

//import com.sun.org.apache.bcel.internal.generic.FSUB;

import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        //subSeq("","abc"); // Approach 1
        //System.out.println(subSeqUsingArray("","abc"));; // Approach 2
        subSeqAscii("","abc"); // Print Ascii value as well

    }

    public static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeq(p+ch,up.substring(1));

        subSeq(p,up.substring(1));
    }

    public static ArrayList<String> subSeqUsingArray(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> right = subSeqUsingArray(p+ch,up.substring(1));

        ArrayList<String> left = subSeqUsingArray(p,up.substring(1));

        left.addAll(right);
        return left;
    }

    public static void subSeqAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subSeqAscii(p+ch,up.substring(1));
        subSeqAscii(p,up.substring(1));
        subSeqAscii(p+(ch + 0),up.substring(1));
    }



}
