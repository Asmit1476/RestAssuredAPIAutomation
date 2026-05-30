package Algorithms;

public class Pallandrome {
    public static void main(String[] args) {

        int num =1001;
        int realNum=num;

        int reminder;
        int reverse=0;

        while(num!=0){
            reminder = num % 10;
            reverse = reverse * 10 + reminder;
            num = num/10;
        }
        System.out.println("Reversed number is: "+reverse);
        System.out.println("Number "+realNum);

        if(realNum == reverse){
            System.out.println("Number is a palandrome");
        }else{
            System.out.println("Number is not a palandrome");
        }
    }
}
