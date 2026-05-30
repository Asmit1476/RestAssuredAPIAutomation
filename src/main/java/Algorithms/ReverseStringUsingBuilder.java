package Algorithms;

public class ReverseStringUsingBuilder {
    public static void main(String[] args) {
        String str = "My name is Asmit";
        String result ="";

        String[] words = str.split(" ");
        //StringBuilder builder = new StringBuilder();
        for(int i=0; i<words.length;i++){
            String eachWord = words[i];
            StringBuilder builder = new StringBuilder(eachWord);
            result = result + builder.reverse() + " ";

        }
        System.out.println("Reverse String is : "+result);
    }
}
