package Tress;
import java.util.*;
public class Odd {
	
	private class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	private Node head,tail;
	public void print() {
		Node temp=this.head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public void add(int val) {
		Node n=new Node(val);
		if(this.head==null) {
			head=n;
			this.tail = n;
			
		}
		else {
			
			this.tail.next = n;
			this.tail = n;
		}
	}
	public void odd() {
		if(this.head==null) {
			return ;
		}
		Node odd = this.head;
		Node use = head.next;
		Node even = head.next;
		while(true) {
			if(odd==null || even==null || even.next==null) {
				odd.next=use;
				break;
			}
			odd.next=even.next;
			odd= even.next;
			if(odd.next==null) {
				even.next=null;
				odd.next=use;
				break;
			}
			even.next=odd.next;
			even=odd.next;
			
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Odd ls=new Odd();
		for(int i =0;i<n;i++) {
			ls.add(sc.nextInt());
		}
		System.out.print("Original List: ");
		ls.print();
		System.out.println();
		ls.odd();
		System.out.print("Modified List: ");
		ls.print();
	}
	
}
	
