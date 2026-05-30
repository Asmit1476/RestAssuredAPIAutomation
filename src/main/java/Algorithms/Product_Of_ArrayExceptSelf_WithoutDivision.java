package Algorithms;

import java.util.Arrays;

public class Product_Of_ArrayExceptSelf_WithoutDivision {
    public int[] productExceptSelf(int[] nums) {

        int N= nums.length;


        int[] output_products = new int[N];

        output_products[0]=1;


        for(int i=1;i<N;i++){
            output_products[i]= output_products[i-1]*nums[i-1];
        }


        int R=1;

        for(int j=N-1;j>=0;j--){
            output_products[j] =  output_products[j]*R;
            R = R * nums[j];
        }

        return output_products;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,0,1};
        Product_Of_ArrayExceptSelf_WithoutDivision ob = new Product_Of_ArrayExceptSelf_WithoutDivision();
        //ob.productExceptSelf(arr);
        System.out.println(Arrays.toString(ob.productExceptSelf(arr)));

    }
}
