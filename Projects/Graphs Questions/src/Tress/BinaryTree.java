package Tress;
import java.util.*;
public class BinaryTree {
	Scanner sc = new Scanner(System.in);
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
	/*public void takeinput() {
		Scanner scn = new Scanner(System.in);
		Queue<Node> q = new LinkedList<>();
		int val = scn.nextInt();
		root = new Node(val);
		q.add(root);
		while (!q.isEmpty()) {
			Node pn = q.remove();
			boolean b =scn.nextBoolean();
			if(b) {
				int ld = scn.nextInt();
				Node ln = new Node(ld);
				pn.left = ln;
				q.add(ln);
			}
			boolean a =scn.nextBoolean();
			if(a) {
				int rd = scn.nextInt();
				Node rn = new Node(rd);
				pn.rigth = rn;
				q.add(rn);
			}
		}
}*/
	public void display() {
		display(this.root);
	}
	private void display(Node n ) {
		if(n==null) {
			return;
		}
		String str ="";
		if(n.left==null) {
			str+="END";
		}
		else {
			str+=n.left.data;
		}
		str += " => " + n.data + " <= ";



		if (n.rigth == null)

			str += "END";

		else

			str += n.rigth.data;



		System.out.println(str);



		display(n.left);

		display(n.rigth);


		
	}
	/*public Node leafNode() {
		return(leafNode(this.root));
	}*/
	/*private Node leafNode(Node n) {
		if(n==null) {
			return null;
		}
		if(n.left ==null && n.rigth== null) {
			return null;
		}
		n.left=leafNode(n.left);
		n.rigth=leafNode(n.rigth);
		return n;
	}*/
	/*public ArrayList<Integer> level(ArrayList<Integer> a) {
		return(level(this.root));
	}*/
	/*private ArrayList<Integer> level(Node n,ArrayList<Integer> a){
		if(n==null) {
			return a;
		}
		if(n==root) {
			a.add(root.data);
		}
		else
			a.add(n.left.data,n.rigth.data);
		if(n.left!=null)
			level(n.left,a);
		if(n.rigth!=null)
			level(n.rigth,a);
		return a;
	
	
	}*/
	/*private ArrayList<Integer> level(Node n){
		ArrayList<Integer> a= new ArrayList<Integer>() ;
		if(n!=null) {
			a.add((n.data));
		}
		Node left = n.left;
		Node rigth= n.rigth;
		while(left!=null || rigth!=null) {
			a.add((left.data,rigth.data));
			left = left.left;
			rigth = left.rigth;
			
		}
	}*/
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
	public int sum() {
		return(sum(this.root));
	}
	private int sum(Node n) {
		if(n==null) {
			return 0;
			
		}
		return(n.data+sum(n.left)+sum(n.rigth));
		

}
	/*public void removeLeaves() {
		removeLeaves(null,this.root,false);
	}
	private void removeLeaves(Node parent,Node child,boolean ans) {
		if(parent == null) {
			return;
		}
		if(child.left==null && child.rigth==null) {
			ans=true;
		}
		removeLeaves(child,child.left,false)
		if(ans) {
			parent.left=null;
		}
		removeLeaves(child)
	}*/
	private int height(Node n){
		if(n==null){
			return 0;
		}
		int lh = height(n.left);
		int rh=height(n.rigth);
		if(lh>rh){
			return(lh+1);
		}
		else{
			return rh+1;
		}
	}
	/*public ArrayList<ArrayList<Integer>> levelArrayList() {
		ArrayList<ArrayList<Integer>> level=new ArrayList<ArrayList<Integer>>();
		for(int i =1;i<=this.height(this.root);i++){
			ArrayList<Integer> l= new ArrayList<Integer>();
			traverse(this.root,i,l);
			level.add(l);
		}
		return level;
	}
	private void traverse(Node n,int p,ArrayList<Integer>l){
		if(n==null){
			return ;
		}
		else if(p==1){
			l.add(n.data);
			//return l;
		}
		else{
			 traverse(n.left,p-1,l);
			 traverse(n.rigth,p-1,l);
			 
		}
		//return rc;
	}*/
	public void levelOrderNewLine() {
		for(int i =1;i<=this.height(this.root);i++){
			
			print(this.root,i,i%2);
			
		}
		
	}
	private void print(Node n,int l,int rev){
		if(n == null){
			return;
		}
		else if(l==1){
			System.out.print(n.data+" ");
		}
		else if(rev ==1) {
			print(n.left,l-1,rev);
			print(n.rigth,l-1,rev);
		}
		else {
			print(n.rigth,l-1,rev);
			print(n.left,l-1,rev);
		}
	}
	public void sibling() {
		sibling(this.root);
	}
	private void sibling(Node n) {
		if(n==null) {
			return;
		}
		
		if(n.left!=null && n.rigth==null) {
			System.out.print(n.left.data+ " ");
		}
		if(n.left==null && n.rigth!=null) {
			System.out.print(n.rigth.data+" ");
		}
		sibling(n.left);
		sibling(n.rigth);
	}
	public void rootSum(int sum){
		if(root!=null)
		rootSum(this.root,sum,root.data,""+root.data);
	}
	private void rootSum(Node n,int sum,int s,String ans){
		if(sum==s){
			System.out.println(ans);
			return;
		}
		if(n==null){
			return;
		}
		
		if(n.left!=null)
			rootSum(n.left,sum,s+n.left.data,ans+" "+n.left.data);
		if(n.rigth!=null)
			rootSum(n.rigth,sum,s+n.rigth.data,ans+" "+n.rigth.data);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BinaryTree bt = new BinaryTree();
		bt.takeinput();
		//bt.root=bt.leafNode();
		//bt.display();
		//System.out.println(bt.levelArrayList());
		//bt.levelOrderNewLine();
		//bt.display();
		//bt.sibling();
		bt.rootSum(50);
	}
	}

