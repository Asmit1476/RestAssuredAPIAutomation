package Algorithms;

public class Find_ith_Bit {
    public static void main(String[] args) {
        // Binary number: 100110101
        int binaryNumber = 0b100110101;

        // Bit mask with only the 5th bit set to 1
        int mask = 1 << 4; // Shift 1 four positions to the left to set the 5th bit

        // Perform bitwise AND operation
        int result = binaryNumber & mask;

        // Check if the 5th bit is set or not
        if (result != 0) {
            System.out.println("The 5th bit is set (1).");
        } else {
            System.out.println("The 5th bit is not set (0).");
        }
    }
}
