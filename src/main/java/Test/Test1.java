package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
//        Input :  baaabaabaab
//        Output : b
//                c=3

        String str = "abbaaabaab";
        int c=3;
        int length = str.length();

       // int arr[] = new int[length];
        ArrayList<Character> arr = new ArrayList<>();

        for(int i=0; i<length;i++){

            while(i>0) {

                if (str.charAt(i) == str.charAt(i + 1) && i < 3) {
                    if (i == 2) {
                        i = i + 1;

                    } else{
                        break;
                    }


                } else {
                    arr.add(str.charAt(i)); //b
                }
            }

        }
        System.out.println("Result: "+ arr);
    }
}
