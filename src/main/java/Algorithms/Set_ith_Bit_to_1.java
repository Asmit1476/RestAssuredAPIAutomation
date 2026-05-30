package Algorithms;


//Bit Manipulation Tricks------
// Find number of digits in a binary number = log2n +1 -> where 2 is base
// Find number of digits in an integer number = log10n +1 -> where 10 is base
// Make the least significant set bits to 0 in any number -> n & (n-1)

public class Set_ith_Bit_to_1 {

        public static void main(String[] args) {
            // Binary number: 100110101
            int binaryNumber = 0b100110101;
            int i = 3;

            // Bit mask with only the 3rd bit set to 1
            int mask = 1 << i;

            // Perform bitwise OR operation
            binaryNumber = binaryNumber | mask;
            System.out.println("New Binary digit is: "+ Integer.toBinaryString(binaryNumber));


        }
    }

