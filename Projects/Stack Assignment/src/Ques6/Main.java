/*It's winter season. There is a long queue of students from the four prime courses at Coding Blocks and everyone is here
to grab his hoodie. Each student of a course has a different roll number. Whenever a new student will come, 
he will search for his friend from the end of the queue. Note that a student can only has friend from his course and 
not from any other course. As soon as he will find any of the friend in the queue, he will stand behind him, 
otherwise he will stand at the end of the queue. At any moment Prateek Bhaiya will ask the student, who is standing in 
front of the queue, to come and put his name and grab his hoodie and then remove that student from the queue. 
There are Q operations of one of the following types: 
E x y : A new student of course x whose roll number is y will stand in queue according to the method mentioned above.
D : Prateek Bhaiya will ask the student, who is standing in front of the queue, to come and put his name for 
the hoodie and remove him from the queue.
Find out the order in which student put their name.*/
package Ques6;

import java.util.*;

class Main {

	protected int size;

	protected int front;
	protected int[] data;

	public Main() {
		this.size = 0;
		this.front = 0;
		this.data = new int[5];
	}

	public Main(int cap) {
		this.size = 0;
		this.front = 0;
		this.data = new int[cap];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void enqueue(int item) throws Exception {
		if (this.size() == this.data.length) {
			int[] oa = this.data;
			int[] na = new int[oa.length * 2];
			for (int i = 0; i < this.size(); i++) {
				int idx = (i + front) % oa.length;
				na[i] = oa[idx];
			}

			this.data = na;
			this.front = 0;
		}

		// if (this.size == this.data.length) {
		// throw new Exception("queue is full");
		// }

		this.data[(front + size) % this.data.length] = item;
		size++;

	}

	public int dequeue() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");

		}

		int rv = this.data[front];
		front = (front + 1) % this.data.length;
		size--;

		return rv;

	}

	public int getFront() throws Exception {
		if (this.size == 0) {
			throw new Exception("queue is empty");
		}

		int rv = this.data[front];

		return rv;
	}

	public void display() {
		System.out.println();
		for (int i = 0; i < size; i++) {
			int idx = (i + front) % this.data.length;
			System.out.print(this.data[idx] + " ");
		}
        System.out.print("END");
	}

	
    public static void hoodies(int q) throws Exception{ 
	Main q1 = new Main();
	Main q2 = new Main();
	Main q3 = new Main();
	Main q4 = new Main();
	StringBuilder order = new StringBuilder();
	int pos;
	char c1;
	while(q-->0) {
		String s = scn.nextLine();
		char c =s.charAt(0);
		
		if(c=='E') {
			
			if(s.charAt(2)=='1') {
				q1.enqueue(Integer.parseInt(s.substring(4)));
				if(order.lastIndexOf("1")==-1) 
					order.append("1");
			
				
				
					
			}
			else if(s.charAt(2)=='3') {
				q3.enqueue(Integer.parseInt(s.substring(4)));
				if(order.lastIndexOf("3")==-1)
					order.append("3");
				
				
			}
			else if(s.charAt(2)=='2') {
				q2.enqueue(Integer.parseInt(s.substring(4)));
				if(order.lastIndexOf("2")==-1) 
					order.append("2");
			
			}
			else{
 				q4.enqueue(Integer.parseInt(s.substring(4)));
 				if(order.lastIndexOf("4")==-1) 
					order.append("4");
				
			}
		}
		else {
			 c1 =order.charAt(0);
			
			if(c1=='1') {
				System.out.println(c1+" "+q1.dequeue());
				if(q1.isEmpty())
					order.deleteCharAt(0);
			}
	
			if(c1=='2') {
				System.out.println(c1+" "+q2.dequeue());
				if(q2.isEmpty())
					order.deleteCharAt(0);
		}
				
	
			if(c1=='3') {
				System.out.println(c1+" "+q3.dequeue());
				if(q3.isEmpty())
					order.deleteCharAt(0);
			}
				
			
			if(c1=='4') {
				System.out.println(c1+" "+q4.dequeue());
				if(q4.isEmpty())
					order.deleteCharAt(0);
			}
	}
	}
	
	


	
} 


	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {

        int n = scn.nextInt();
        scn.nextLine();
        
        hoodies(n);
	}

}
