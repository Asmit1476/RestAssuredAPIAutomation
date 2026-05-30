package dsa.Tree;

import java.util.Scanner;

public class BinaryTree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createBinaryTree();
        System.out.println("Binary Tree is: "+root);

    }
    static Node createBinaryTree(){
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        root = new Node(data);
        if(data == -1){
            return null;
        }
        System.out.println("Enter left data: ");
        root.left = createBinaryTree();

        System.out.println("Enter right data: ");
        root.right = createBinaryTree();

        return root;


    }


}

 class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data= data;
    }

}
