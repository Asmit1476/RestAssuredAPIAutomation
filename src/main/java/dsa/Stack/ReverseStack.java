package dsa.Stack;

import java.util.Stack;

public class ReverseStack {
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int ele = stack.pop();
        reverse(stack);
        pushAtBottom(ele,stack);
    }
    public static void pushAtBottom(int ele,Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(ele);
            return;
        }
        int top = stack.pop();
        pushAtBottom(ele,stack);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(20);
        stack.push(10);
        stack.push(90);
        stack.push(4);
        stack.push(12);

        System.out.println("Before reversing the Stack");
        System.out.println(stack);

        reverse(stack);

        System.out.println("After reversing the stack");
        System.out.println(stack);
    }
}
