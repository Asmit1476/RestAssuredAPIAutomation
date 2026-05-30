
//Find non-repeating element in an array where every element repeats twice.
package Algorithms;

public class FindNonRepeatingElement {
    public static void main(String[] args) {

        int arr[] = {5,4,1,4,3,5,1};
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res = res ^ arr[i]; //Take XOR of all the elements with 0;

        }
        System.out.println(res);

    }


}
