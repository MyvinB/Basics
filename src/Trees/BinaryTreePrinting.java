package Trees;

///https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/

public class BinaryTreePrinting {
		static class Node{
			int key;
			Node left,right;
			public Node(int val) {
				// TODO Auto-generated constructor stub
				key=val;
				left=right=null;
			}
		}
		
		  static void printPreorder(Node node){
			  if(node==null)return;
			  System.out.print(node.key);
			  printPreorder(node.left);
			  printPreorder(node.right);
		  }
		  static void printInorder(Node node){
			  if(node==null)return;
			  printInorder(node.left);
			  System.out.print(node.key);
			  printInorder(node.right);
		  }
		  static void printPostOrder(Node node){
			  if(node==null)return;
			  printInorder(node.left);
			  printInorder(node.right);
			  System.out.print(node.key);  
		  }	
		public static void main(String[] args) {
			Node start=new Node(4);
			start.left=new Node(2);
			start.right=new Node(5);
			start.left.left=new Node(1);
			start.left.right=new Node(3);
			printPreorder(start);
			System.out.println();
			printInorder(start);
			System.out.println();
			printPostOrder(start);

		}
}
