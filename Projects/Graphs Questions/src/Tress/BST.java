package Tress;

import java.util.*;
public class BST {
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root;
	private int size;

	public BST() {
		this.root = null;
		this.size = 0;
	}
	
	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void add(int data) {
		this.add(data, this.root);
	}

	private void add(int data, Node node) {
		if (this.isEmpty()) {
			Node n = new Node(data, null, null);
			this.size++;
			this.root = n;
			return;
		} else {
			if (data > node.data && node.right == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.right = n;
			} else if (data < node.data && node.left == null) {
				Node n = new Node(data, null, null);
				this.size++;
				node.left = n;
			} else if (data > node.data) {
				add(data, node.right);
			} else if (data < node.data) {
				add(data, node.left);
			}
		}
	}

       public void remove(int data) {
		this.root = this.remove(this.root, data);
	}

	private Node remove(Node node, int data) {
		if (node == null) {
			return null;
		}
		if (data < node.data) {
			node.left = this.remove(node.left, data);
			return node;
		} else if (data > node.data) {
			node.right = this.remove(node.right, data);
			return node;
		} else {
			if (node.left == null && node.right == null) {
				this.size--;
				return null;
			} else if (node.left == null) {
				this.size--;
				return node.right;
			} else if (node.right == null) {
				this.size--;
				return node.left;
			} else {
				int lmax = this.max(node.left);
				node.data = lmax;
				node.left = this.remove(node.left, lmax);
				return node;
			}
		}
	}

	public void display() {
		this.display(this.root);
	}

	/*private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("END => ");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print(" <= " + node.right.data);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();
		if (node.left != null) {
			display(node.left);
		}
		if (node.right != null) {
			display(node.right);
		}
	}*/
	public class sol{
		int level=0;
		Node add;
	}
	sol s = new sol();
	
	public void  search(Node n ,int tar) {
		
		if(n==null) {
			s.add=null;
			
			return;
		}
		if(n.data==tar) {
			s.add=n;
			return;
			
			
			
		}
		if(n.data<tar) {
			s.level =s.level+1;
			search(n.right,tar);
		}
		if(n.data>tar) {
			s.level=s.level+1;
			
			search(n.left,tar);
		}
		
	}
	
	 public void printKFar(int tar, int k) {
		 search(this.root,tar);
		 System.out.println(s.level);
		 if(s.level>k) {
			 printKUp(this.root,s.level-k);
		 }
		 
		 printKDown(s.add, k);
	    }

	private void printKUp(Node n , int k) {
		if(k==0 && n!=null) {
			System.out.println(n.data);
			return;
		}
		if(n==null) {
			return;
		}
		
		printKUp(n.left,k-1);
		printKUp(n.right,k-1);
	}
	private void display(Node n){
		if(n==null){
			return;
		}
		System.out.print(n.data+" ");
		display(n.left);
		display(n.right);
	}

	 private void printKDown(Node node, int k) {
		 if(node==null) {
			 return;
		 }
		 if(k==0) {
			 System.out.println(node.data);
			 
		 }
		 printKDown(node.left,k-1);
		 printKDown(node.right,k-1);
		 
	 }
	 public void sumLarger(){
			sumLarger(this.root);
		}
		static int sum=0;
		private void sumLarger(Node n){
			if(n==null){
				return;
			}
			sumLarger(n.right);
			int temp=n.data;
			n.data=n.data+sum;
			sum=sum+temp;
			
			sumLarger(n.left);
		}
	    
	    public static void main (String[] args) {
	        BST bst=new BST();
            Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        for(int i=0;i<n;i++){
	           bst.add(s.nextInt()); 
	        }
	        bst.sumLarger();
	        bst.display();
            //int tar=s.nextInt();
            //int k=s.nextInt();
	        //bst.printKFar(tar,k);
	    }
}

