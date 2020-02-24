package Trees;/*
 @author Myvin Barboza
 2/24/2020 2:52 PM
 */

public class BinaryTreeHeight {

    static int FindHeight(Node temp){
        if(temp==null)return -1;
        int left=FindHeight(temp.left);
        int right=FindHeight(temp.right);
        return Math.max(left,right)+1;
    }


    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        System.out.println(FindHeight(root));
    }
}
