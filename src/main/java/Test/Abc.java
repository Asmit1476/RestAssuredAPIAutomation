package Test;

public class Abc {

    public int calculateDistance(String str){

        //String str = "aabcaabcabba";

        int n=str.length()-1;

        for(int i=0;i<str.length();i++) {
            //int n=str.length()-1;
            for (int k = n; k > 0; k--) {
                //System.out.println("Length is: " + n);
                if (str.charAt(i) == str.charAt(k - 1) && i < k) {
//                    System.out.println("First: "+str.charAt(i));
//                    System.out.println("End: "+str.charAt(k-1));
//                    System.out.println("Value of i is: "+i);
//                    System.out.println("Value of ith is: "+(k-1));
                    if (str.charAt(i + 1) == str.charAt(k) && i + 1 < n - 1) {
//                        System.out.println("Inside IF Again");
//                        System.out.println("Name");
//                        System.out.println("First Second: "+str.charAt(i+1));
//                        System.out.println("Value of K is: "+k);
//                        System.out.println("End Second: "+str.charAt(k));
//                        System.out.println("Index from start " + str.indexOf(str.charAt(i)));
//                        System.out.println("Index from end " + str.indexOf(str.charAt(k)));
                        int distance = (k-1-i-1);
                        System.out.println("Distance is: "+(k-1-i-1));
                        return distance ;
                    }

                }
            }

        }
        return -1;

    }
    public static void main(String[] args) {

        String str = "codility";
        Abc ob = new Abc();
        int result = ob.calculateDistance(str);

    }
}
