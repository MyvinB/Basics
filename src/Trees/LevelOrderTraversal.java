//https://www.youtube.com/watch?v=D2bIbWGgvzI
package Trees;/*
 @author Myvin Barboza
 2/24/2020 12:39 PM
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {

    static void levelOrderReversal(Node temp){
        Queue<Node> q=new LinkedList<Node>();
        Stack<Node> stack = new Stack<Node>();
        q.add(temp);
        while(!q.isEmpty()){
            temp=q.poll();
            if(temp.left!=null){
                q.add(temp.left);
            }
            if(temp.right!=null){
                q.add(temp.right);
            }
            stack.add(temp);
        }
        System.out.println(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop().key);
        }


    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
        root.right.left=new Node(60);
        root.right.right=new Node(70);
        levelOrderReversal(root);
    }
}
