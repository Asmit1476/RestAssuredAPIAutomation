package dsa.Stack;
import java.util.*;

// Stack implementation using LinkedList
public class StackDS {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack {
        public static Node head = null;

        public static boolean isEmpty(){
                return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }else {
                newNode.next = head;
                head = newNode;
            }
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }else {
                Node top = head;
                head = head.next;
                return top.data;
            }
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            Node top = head;
            return top.data;
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
