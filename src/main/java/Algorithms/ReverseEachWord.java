package Algorithms;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str = "I love India";

        String[] words = str.split(" ");

        StringBuilder builder = new StringBuilder();

        String reverse ="";

        for(int i=0; i<words.length; i++){
            String word = words[i];

            for(int j = word.length()-1;j>=0;j--){
                reverse = reverse + word.charAt(j);

            }
            reverse = reverse + " ";

        }
        System.out.println("Reverse is: "+reverse);
    }
}
