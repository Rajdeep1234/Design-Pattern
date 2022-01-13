package com.ds.tree;

public class TreeNode {

	public static void main(String[] args) {
          Tree tree=new Tree(1); //root
          tree.root.left=new Node(2);
          tree.root.right=new Node(3);
		
		
          tree.root.left.left=new Node(4);
          tree.root.left.right=new Node(5);
          
          tree.root.right.left=new Node(6);
          tree.root.right.right=new Node(7);
          tree.inOrderTraversal(tree.root);
          
          System.out.println("=================");
          
          tree.preOrderTraversal(tree.root);
          
          System.out.println("=================");
          
          tree.postOrderTraversal(tree.root);
	}

}

class Tree{
	
	
	Node root;
	
	public Tree(int value)
	{
		this.root=new Node(value);
	}
	
	
	
	public void inOrderTraversal(Node node) {
		if(null!=node) {
		inOrderTraversal(node.left);
		System.out.println(""+node.value);
		inOrderTraversal(node.right);
		}
	}
	
   public void preOrderTraversal(Node node ) {
	   if(null!=node) {
		   System.out.println(""+node.value);
		   preOrderTraversal(node.left);
			
		   preOrderTraversal(node.right);
			}
		
	}

   public void postOrderTraversal(Node node) {
	
	   if(null!=node) {
		  
		   postOrderTraversal(node.left);
			
			postOrderTraversal(node.right);
			 System.out.println(""+node.value);
			}
}
}




















