package Algorithms;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(count(120300004));

    }

    public static int count(int n){

        return helper(n,0);
    }

    public static int helper(int n,int count){
        if(n==0){
            return count;
        }
        int rem = n%10;
        System.out.println("Reminder"+rem);
        if(rem ==0){
            return helper(n/10,count+1);
        }else{
            return helper(n/10,count);
        }
    }
}
