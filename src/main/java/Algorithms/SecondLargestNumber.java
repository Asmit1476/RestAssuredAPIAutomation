package Algorithms;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3,99,-1,-2,-2,-1,99};
        int secondMax = Integer.MIN_VALUE;
        int firstMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i] > firstMax){
                firstMax = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondMax && arr[i]<firstMax){
                secondMax = arr[i];
            }
        }

        System.out.println("First Max: "+firstMax +" Second Max: "+secondMax);
    }
}
