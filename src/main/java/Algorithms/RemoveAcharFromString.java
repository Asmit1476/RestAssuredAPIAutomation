package Algorithms;

public class RemoveAcharFromString {
    public static void main(String[] args) {
        String word = "baccad";
        String result = "";
        String result1 = removeChar(word,result,0);
        //System.out.println(result1);
       // System.out.println(skipApple("baccappledhg"));
        System.out.println(skipAppNotApple("baccappledhgappdz"));

    }
    public static String removeChar(String word,String result,int i){

        if(word.isEmpty()){
            return result;
        }

        if(i>=word.length()){
            return result;
        }

        if(word.charAt(i)=='a'){
            return removeChar(word,result,i+1);

        } else{
            result = result + word.charAt(i);
            return removeChar(word,result,i+1);
        }

    }

    public static String skipApple(String word){
        if(word.isEmpty()){
            return "";
        }

        if(word.startsWith("apple")){
            return skipApple(word.substring(5));
        }else{
            return word.charAt(0) + skipApple(word.substring(1));
        }

    }

    public static String skipAppNotApple(String word){
        if(word.isEmpty()){
            return "";
        }

        if(word.startsWith("app") && !word.startsWith("apple")){
            return skipAppNotApple(word.substring(3));
        }else{
            return word.charAt(0) + skipAppNotApple(word.substring(1));
        }

    }
}
