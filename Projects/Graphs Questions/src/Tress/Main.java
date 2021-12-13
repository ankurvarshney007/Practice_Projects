package Tress;
import java.util.*;


public class Main {
	private class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
		}
	}
	private Node head,res,tail,cur;
	int carry=0;
	public void push(int val,int list) {
		Node n = new Node(val);
		
		if(list==3) {
			n.next=res;
			res=n;
		}
	}
	public void print(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	private int size(Node head) {
		Node temp = head;
		int size =0;
		while(temp!=null) {
			size=size+1;
			temp=temp.next;
		}
		return size;
	}
	public void add(Main l2) {
		if(this.head==null) {
			res=l2.head;
			return;
		}
		if(l2.head==null) {
			res= this.head;
			return;
		}
		int size1= size(this.head);
		int size2 = size(l2.head);
		if(size1==size2) {
			sumSame(this.head,l2.head);
		}
		else {
			if(size1<size2) {
				Node temp = this.head;
				this.head= l2.head;
				l2.head= temp;
			}
			int diff = Maths.abs(size2-size1);
			
			 cur=this.head;
			
			for(int i=0;i<diff;i++) {
				cur=cur.next;
			}
			sumSame(cur,l2.head);
			carry(this.head);
			
			}
		if(carry>0) {
			push(carry,3);
		}
		print(res);
		
	}
	public void print() {
		print(res);
	}
	public void addLast(int data) {
		Node node = new Node(data);

		if (this.size(this.head) == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}

		
	}
	void sumSame(Node n , Node m) {
		if(n==null) {
			return;
		}
		sumSame(n.next,m.next);
		int sum = n.data+m.data+carry;
		carry = sum/10;
		sum= sum%10;
		push(sum,3);
		
}
	void carry(Node head1) {
		if(head1!=cur) {
			carry(head1.next);
			int sum = carry+head1.data;
			carry=sum/10;
			sum%=10;
			push(sum,3);
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main l1= new Main();
		Main l2 = new Main();
		int n = sc.nextInt();
		int m = sc.nextInt();
		for(int i =0;i<n;i++) {
			l1.addLast(sc.nextInt());
		}
		for(int i =0;i<m;i++) {
			l2.addLast(sc.nextInt());
		}
		//l1.print();
		
		l1.add(l2);
		
		
		
	}

}
