package Trees;

/*
 @author Myvin Barboza
 23/02/20 7:38 PM 
 */
public class Node {
     Node left,right;
        int key;

    public Node(int val) {
        this.left = null;
        this.right = null;
        this.key = val;
    }
}