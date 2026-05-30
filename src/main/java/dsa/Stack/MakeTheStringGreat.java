package dsa.Stack;

import java.util.Stack;

// Leetcode Problem Link -> https://leetcode.com/problems/make-the-string-great/description/?envType=problem-list-v2&envId=stack

public class MakeTheStringGreat {
    public static String makeStringGreat(String str) {
        Stack<Character> stack = new Stack<>();
        for (Character ch : str.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - ch) == 32) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
        public static void main (String[]args){
            String str = "abBAcCD";
            String latest = makeStringGreat(str);
            System.out.println("Updated String is: "+latest);
        }
    }
