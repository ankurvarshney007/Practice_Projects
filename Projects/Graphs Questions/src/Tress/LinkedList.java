package Tress;
import java.util.*;
public class LinkedList {
	private class Node {
		int data;
		Node next;
		public Object l2;
		public Object list2;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public LinkedList(Node head, Node tail, int size) {
		this.head = head;
		this.tail = tail;
		this.size = size;
	}

	// O(1)
	public int size() {
		return this.size;
	}

	// O(1)
	public boolean isEmpty() {
		return this.size() == 0;
	}

	// O(1)
	public int getFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty.");
		}

		return this.head.data;
	}

	// O(1)
	public int getLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty.");
		}

		return this.tail.data;
	}

	// O(N)
	public int getAt(int idx) throws Exception {
		Node temp = this.getNodeAt(idx);
		return temp.data;
	}

	// O(N)
	private Node getNodeAt(int idx) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		if (idx < 0 || idx >= this.size()) {
			throw new Exception("Invalid arguments");
		}

		Node retVal = this.head;
		for (int i = 0; i < idx; i++) {
			retVal = retVal.next;
		}

		return retVal;
	}

	// O(1)
	public void addFirst(int data) {
		Node node = new Node(data, this.head);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.head = node;
		}

		this.size++;
	}

	// O(1)
	public void addLast(int data) {
		Node node = new Node(data, null);

		if (this.size() == 0) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}

		this.size++;
	}

	// O(n)
	public void addAt(int idx, int data) throws Exception {
		if (idx < 0 || idx > this.size()) {
			throw new Exception("Invalid arguments");
		}

		if (idx == 0) {
			this.addFirst(data);
		} else if (idx == this.size()) {
			this.addLast(data);
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node n = nm1.next;

			Node node = new Node(data, n);
			nm1.next = node;

			this.size++;
		}
	}

	// O(1)
	public int removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		int retVal = this.head.data;

		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}

		this.size--;
		return retVal;
	}

	// O(n)
	public int removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		int retVal = this.tail.data;

		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node sm2 = this.getNodeAt(this.size() - 2);
			sm2.next = null;
			this.tail = sm2;
		}

		this.size--;
		return retVal;
	}

	// O(n)
	public int removeAt(int idx) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is empty");
		}

		if (idx < 0 || idx >= this.size()) {
			throw new Exception("Invalid arguments");
		}

		if (idx == 0) {
			return this.removeFirst();
		} else if (idx == this.size() - 1) {
			return this.removeLast();
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			this.size--;

			return n.data;
		}
	}

	// O(n)
	public void display() {
		Node node = this.head;

		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}

		//System.out.println("END");
	}
	public void appendLastN(int n) throws Exception {
		if(this.size()<=n) {
			return;
		}
		else {
		Node fast =head;
		for(int i =0;i<n;i++) {
			fast=fast.next;
			
		}
		Node slow = head;
		Node prev=null;
		while(fast!=null) {
			prev = slow;
			slow = slow.next;
			fast=fast.next;
			
		}
		tail.next=head;		
		head = slow;
		prev.next=null;
		}
	}
	public long Sum(LinkedList l) {
		return(sum(this.head)+sum(l.head));
	}
	private long sum(Node n) {
		Node temp = n ;
		long num=0;
		while(temp!=null) {
			num=num*10+temp.data;
			temp=temp.next;
		}
		return num;
		
	}
	private void mergerList(LinkedList list2) {
		mergerList(this.head,list2.head);
	}
	public void mergerList(Node head1,Node head2) {
		LinkedList l = new LinkedList();
		while(head1!=null && head2!=null){
			if(head1.data<head2.data){
				l.addLast(head1.data);
				head1=head1.next;
			}
			else{
				l.addLast(head2.data);
				head2=head2.next;
			}
		}
		while(head1!=null){
			l.addLast(head1.data);
			head1=head1.next;
		}
		while(head2!=null){
			l.addLast(head2.data);
			head2=head2.next;
		}
		l.display();
	}
	public void deleteLarger() {
		
		Node head1=this.head;
		//Node head2=head1.next;
		Node prev=head;
		
		int max = head1.data;
		
		while(head1!=null && head1.next!=null) {
			if(head1.data<head1.next.data) {
				if(max<head1.next.data) {
					this.head=head1.next;
					max=head1.next.data;
					head1=head1.next;
				}
				else {
					
					
					prev.next=head1.next;
					head1=head1.next;
				}
			}	
			else {
				prev = head1;
				head1=head1.next;
			}
				
			}
		this.display();
	}
		

		
		
		

public static void main(String[] args) throws Exception {
		
		Scanner scn = new Scanner(System.in);
		//int N = scn.nextInt();
		//int M = scn.nextInt();

		
		LinkedList list = new LinkedList();
		LinkedList list2 = new LinkedList();
		
		int n= scn.nextInt();
		//int m= scn.nextInt();

		for (int i = 0; i < n; i++) {
			list.addLast(scn.nextInt());
		}
		/*for (int i = 0; i < m; i++) {
			list2.addLast(scn.nextInt());
		}*/
		//long res =list.Sum(list2);
		//System.out.println(res);
		
		
		/*StringBuilder s=new StringBuilder(String.valueOf(res));
		for(int i =0;i<s.length();i++) {
			System.out.print(s.charAt(i)+" ");*/
		//list.mergerList(list2);
		list.deleteLarger();
		
		
		//list.appendLastN(n);
		//list.display();
}
}


