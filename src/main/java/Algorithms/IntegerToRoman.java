package Algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class IntegerToRoman {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the roman number");
        String num1 = scan.nextLine();
        int num = Integer.parseInt(num1);

        String thousands[] = {"","M","MM","MMM"};
        String hundreds[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String tenses[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String units[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

        String thousand = thousands[num/1000];
        String hundred = hundreds[(num%1000)/100];
        String tense = tenses[(num%100)/10];
        String unit = units[(num%10)];

        String result = thousand+hundred+tense+unit;
        System.out.println("Result is: "+result);


        }
    }


