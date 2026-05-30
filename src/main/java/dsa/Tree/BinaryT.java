//package dsa.Tree;
//
//public class BinaryT {
//    public static class Node{
//        int data;
//        Node left;
//        Node right;
//        public Node(int data){
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    static class CreateBinaryT{
//        static int index = -1;
//        static dsa.Tree.Node buildBinaryTree(int nodes[]){
//            index++;
//            if(nodes[index]==-1){
//                return null;
//            }
//
//            dsa.Tree.Node newNode = new dsa.Tree.Node(nodes[index]);
//            newNode.left = buildBinaryTree(nodes);
//            newNode.right = buildBinaryTree(nodes);
//            return newNode;
//        }
//
//    }
//
//
//    public static void main(String[] args) {
//        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        CreateBinaryT tree = new CreateBinaryT();
//        Node root = tree.buildBinaryTree(nodes);
//
//    }
//}
//
//
