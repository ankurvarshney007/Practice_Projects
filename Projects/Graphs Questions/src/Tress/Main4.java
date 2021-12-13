package Tress;

import java.util.Scanner;
import java.util.Vector;


public class Main4 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Main4 main = new Main4();
		BinaryTree bt = main.new BinaryTree();
		bt.takeinput();
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(bt.find(n, m));
		
	}
	public class BinaryTree {
		//Scanner sc = new Scanner(System.in);
		
		private class Node{
			int data;
			Node left;
			Node rigth;
			Node(int item){
				this.data=item;}
			Node(){
		}

		}
		private Node root;
		public void takeinput() {
			this.root =takeinput(null,false);
			
			
		}
		
		private Node takeinput(Node n , boolean b) {
			int val = sc.nextInt();
			Node cd = new Node();
			cd.data=val;
			//left child
			boolean lc = sc.nextBoolean();
			if(lc) {
				cd.left= this.takeinput(cd, true);
			}
			boolean rc = sc.nextBoolean();
			if(rc) {
				cd.rigth = takeinput(cd,false);
			}
			return cd;
			
			
		}
		public int find(int num1,int num2) {
			Vector<Integer> path1=new Vector<Integer>();
			boolean ans1= find(this.root,path1,num1);
			
			Vector<Integer> path2=new Vector<Integer>();
			
			boolean ans2= find(this.root,path2,num2);
			
			int lca=-1;
			if(ans1 && ans2) {
				for(int i =0;i<path1.size() && i<path2.size();i++) {
					if(path1.elementAt(i)==path2.elementAt(i)) {
						lca=path1.elementAt(i);
						
					}
				}
				return lca;
					
				}
			else {
				return 0;
			}
			
			}
			
		
		private  boolean find(Node n,Vector<Integer>p1,int k) {
			if(n==null) {
				return false;
			}
			p1.add(n.data);
			if(n.data==k) {
				return true;
			}
			if((n.left!=null && find(n.left,p1,k))|| (n.rigth!=null && find(n.rigth,p1,k))) {
				return true;
				
			}
			p1.remove(p1.size()-1);
			return false;
		}
		
			
		}

		
}
