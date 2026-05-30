package Algorithms;

public class FindTwoNonRepeatingNumber {
    public static void main(String[] args) {

        int arr[] = {5,4,1,4,3,5,1,2};
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res = res ^ arr[i]; //Take XOR of all the elements with 0;

        }
        System.out.println("Res is: "+res);
        int temp=res;
        for(int j=0;j<arr.length;j++){
// Odd numbers contains 1 in the 0th position if converted to binary
            if(arr[j]%2 !=0){
                System.out.println("j is:" +arr[j]);

             temp = temp ^ arr[j];
            }
        }
        System.out.println("Temp is: "+temp);
        System.out.println("Res is: "+res);
        int res1 = res^ temp;

        System.out.println(temp);
        System.out.println(res1);

    }
}
