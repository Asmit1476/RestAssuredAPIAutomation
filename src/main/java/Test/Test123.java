package Test;

public class Test123 {

    public static void main(String[] args) {

        int arr[] = {20,23,40,2,16,80,68};

        int i;
        int index=0;
        int max = arr[0];

        for(i=1;i<arr.length;i++){
            System.out.println("arr value is :"+arr[i]);
            System.out.println("Max value is : "+max);

            if(max<=arr[i]){


                max= arr[i];
                index = i;
            }

        }

        System.out.println("index is : "+index);

    }
}
