package Algorithms;

public class SumOfIndividiualNumbers {
    public static void main(String[] args) {
        int ans = sumOfIndividualNumbers(12345);
        System.out.println(ans);

    }

    public static int sumOfIndividualNumbers(int n){

        if(n==0){
            return 0;
        }
        int remainder = n%10;
        int number = n/10;

        return sumOfIndividualNumbers(number)+remainder;
    }
}
