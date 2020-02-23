package Trees;

import java.util.LinkedList;
import java.util.Queue;

/*
 @author Myvin Barboza
 23/02/20 7:37 PM 
 */
public class BinaryTreeInsertion {

    static void inorder(Node temp){
    if(temp==null)return ;
    inorder(temp.left);
    System.out.print(temp.key+" ");
    inorder(temp.right);
    }

    static void insertNode(Node temp,int key){
        Queue<Node> q=new LinkedList<Node>();
        q.add(temp);
        while(!q.isEmpty()){
            temp=q.peek();
            q.remove();
            if(temp.left==null){
                temp.left=new Node(key);
                break;
            }else{
                q.add(temp.left);
            }

            if(temp.right==null){
                temp.right=new Node(key);
                break;
            }else{
                q.add(temp.right);
            }
        }
    }

    public static void main(String[] args) {
    Node root=new Node(10);
    root.left=new Node(11);
    root.right=new Node(9);
    root.left.left=new Node(7);
    root.left.right=new Node(8);
    root.right.left=new Node(15);
    root.right.right=new Node(8);
    //before insertion
    inorder(root);
    insertNode(root,12);
        System.out.println();
    //after insertion
    inorder(root);
    }
}