package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class Product_Of_ArrayExceptSelf {

    // Calculate the product of an array i.e each index will contain product of value of other index, don't calculate the self index for calculating product
    public static void main(String[] args) {
        int arr[] = {5,4,0};

       // ArrayList<Integer> list = new ArrayList();

        int[] resultArray = new int[arr.length];

        //First Approach, Time complexity - o(n*n)

//        for(int i=0;i<arr.length;i++){
//            int first =1;
//
//            for(int j=0;j<arr.length;j++){
//
//                if(i !=j ) {
//
//                    first *= arr[j];
//
//
//                }
//
//            }
//            list.add(first);
//        }
//
//        System.out.println("Product is: "+list);

        //-------------------------------------------------------------------------------------------------------

        // 2nd Approach, Time complexity - o(2n)
        int num;
        int product =1;
        int realProduct=1;
        int flag=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0) {

                product = product * arr[i];
            }else{
                flag++;
            }

        }

        for(int i=0;i<arr.length;i++){


                realProduct = realProduct * arr[i];


        }

        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0 && flag==0){
                num = realProduct/arr[j];
                //list.add(num);
                resultArray[j]=num;
                System.out.println(resultArray[j]);
            }else if(arr[j]==0 && flag==1){
                resultArray[j]=product;
               // list.add(product);
            }else{

                resultArray[j]=0;
                //list.add(0);
            }
        }
        //System.out.println("Product is: "+list);
        System.out.println("Product is: "+ Arrays.toString(resultArray));


    }
}
