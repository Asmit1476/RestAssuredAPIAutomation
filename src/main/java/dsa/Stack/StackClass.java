package dsa.Stack;

import java.util.ArrayList;
import java.util.Stack;

//Stack implementation using ArrayList
public class StackClass {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            if(list.size() == 0){
                return true;
            }else{
                return false;
            }
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
           if(isEmpty()){
               return -1;
           }else{
               int top = list.get(list.size()-1);
               list.remove(list.size()-1);
               return top;
           }
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }else {
                return list.get(list.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(20);
        stack.push(10);
        stack.push(90);
        stack.push(4);
        stack.push(12);

        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
