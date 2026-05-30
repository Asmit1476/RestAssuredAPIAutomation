package Test;

import java.util.HashMap;

public class xyz {


//    I/p: "a&sm%t
//
//    output: t&ms%a

//    arr[] = {2,4,5,-1,2,-6,7}  //4
//    o/p: {2,2} , {5, -1}

    public static void main(String[] args) {

        int arr[] = {2,4,5,-1,2,-6,7};

        int target = 4;

        HashMap<Integer,Integer> map = new HashMap<>();



        for(int i=0;i<arr.length;i++){
            //System.out.println("Value is: "+arr[i]);


            if(map.containsKey(target-arr[i])){

                System.out.println("1st number is: "+arr[map.get(target-arr[i])] + "Second number is "+arr[i] );

            }

                map.put(arr[i],i);

            }
        }


    }



