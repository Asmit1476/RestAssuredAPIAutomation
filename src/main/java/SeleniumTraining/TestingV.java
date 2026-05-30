package SeleniumTraining;

import java.util.Scanner;

public class TestingV {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        String number = scan.next();

        int num = Integer.parseInt(number);
        int n1 = 3;
        int n2=5;

        for(int i=1; i<=num;i++){

            if(i%n1==0 && i%n2==0){
                //System.out.println("Number is: "+i);
                System.out.println("Boo");
                System.out.println("Foo");
            }else if(i%n1==0){
                //System.out.println("Number is: "+i);
                System.out.println("Boo");
            }else if(i%n2==0){
                //System.out.println("Number is: "+i);
                System.out.println("Foo");


            }else{
                System.out.println(i);
            }
        }




    }
}
