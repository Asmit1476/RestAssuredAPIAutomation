import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        int str[] = {1,5,4,0,8,0,5,0};
        int num=0;
       ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
//        {1,5,4,8,5,0,0}
        for(int i =0; i<str.length;i++){
            if(str[i] == num){
                arr1.add(str[i]);


            }else{
                arr.add(str[i]);
            }
        }
        arr.addAll(arr1);

        for(int val:arr){
            System.out.println(arr);

        }
    }

}
