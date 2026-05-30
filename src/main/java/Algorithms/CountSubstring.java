package Algorithms;

public class CountSubstring {
    /* Checks if a string is empty ("") or null. */
    public static boolean isEmpty(String s) {
        return s == null || s.length() == 0;
    }

    /* Counts how many times the substring appears in the larger string. */
    public static int countMatches(String text, String str)
    {
        if (isEmpty(text) || isEmpty(str)) {
            return 0;
        }

        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            System.out.println("Inital Index  is: "+index);
            if (index != -1)
            {
                count ++;
                index += str.length();
                System.out.println("String lenght is:"+str.length());
                System.out.println("Index count is: "+index);
            }
            else {
                break;
            }
        }

        return count;
    }

    public static int countMatchLatest(String text, String str){
        int count = 0;

        for(int i=0; i< text.length() - str.length(); i++){
            if(text.substring(i, i + str.length()).equals(str)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        String text = "AABCCAAADCBBAADBBC";
        String str = "AA";

        int count = countMatches(text, str);
        System.out.println("Actual count is: "+count);
    }
}
