package com.ds.tree;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BST bst=new BST();
    bst.insert(10);
    bst.insert(9);
    bst.insert(8);
    bst.insert(7);
    bst.insert(6);
    bst.insert(5);
    
    
    bst.inOrder();
    
    bst.delete(8);
    bst.inOrder();
	}

}

class BST{
	
	Node root;
	
	public void BST() {
		
	}
	
	public void insert(int value){
		
			this.root=insertKey(root,value);
	}

	private Node insertKey(Node root, int value) {
		if (root==null) {
		root=new Node(value);
		return root;
		}
		
		if(value<root.value) {
			root.left=insertKey( root.left,  value);
		}
		else if(value>root.value) {
			root.right=insertKey( root.right,  value);
		}
		
		return root;
		
	}
	
	public void inOrder()
	{
		inOrderRec(root);
	}

	private void inOrderRec(Node node) {
		if(node!=null) {
			inOrderRec(node.left);
			System.out.println(""+node.value);
			inOrderRec(node.right);
			}
		
	}
	
	
	public void delete(int value)
	{
		this.root=deleteRec(root,  value);
	}
	
	public Node deleteRec(Node node,int value)
	{
		if(null==node )
		{
			return node;
			
		}
		else if (value<node.value)
		{
			node.left=deleteRec(node.left,value);
		}
		else if (value> node.value)
		{
			node.right=deleteRec(node.right,value);
		}
		else {

			//one children/no childern
			if(node.left==null) {
				return node.right;
			}
			else if (node.right==null) {
				return node.left;
			}
			
			//two children
			node.value=minValue(node.right);
			
			node.right=deleteRec(node.right,node.value);
			
			
		}
		return node;
		
	}

	private int minValue(Node node) {
       int minv=node.value;
       while(node.left!=null) {
    	   minv=root.left.value;
    	   node=node.left;
       }
		return minv;
	}

	
}