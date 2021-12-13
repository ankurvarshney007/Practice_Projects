
/*Prateek sir loves coding. Hence, he took up position of an instructor and founded Coding Blocks, a startup that serves students with awesome code modules.
It is a very famous place and students are always queuing up to have one of those modules.
Each module has a cost associated with it. The modules are kept as a pile. The job of an instructor is very difficult.
He needs to handle two types of queries:
1) Student Query: When a student demands a module, the code module on the top of the pile is given and the student is
charged according to the cost of the module. This reduces the height of the pile by 1. In case the pile is empty, the student goes away empty-handed.
2) Instructor Query: Sir prepares a code module and adds it on top of the pile.
And reports the cost of the module. Help him manage this process.*/
package Ques2;

import java.util.*;
public class Main {
    static Scanner s = new Scanner(System.in);
	public static void main(String args[]) throws Exception {
		// Your Code Here
	
	
	    int q = s.nextInt();
	    s.nextLine();
        Main obj = new Main();
        StacksUsingArrays stack = obj.new StacksUsingArrays();
    	Calculate(stack, q);
	}

	public static void Calculate(StacksUsingArrays stack, int q) throws Exception {
		while(q-- > 0) {
			String type = s.nextLine();
			//.out.println(type);
			if(type.charAt(0)=='1') {
				if(stack.isEmpty()) {
					System.out.println("No Code");
				}
				else {
				System.out.println(stack.top());
				stack.pop();
				}
				
			}
			else {
				int c = Integer.parseInt(type.substring(2));
				stack.push(c);
			}
		}
	}	

	private class StacksUsingArrays {
		private int[] data;
		private int tos;

		public static final int DEFAULT_CAPACITY = 10;

		public StacksUsingArrays() throws Exception {
			// TODO Auto-generated constructor stub
			this(DEFAULT_CAPACITY);
		}

		public StacksUsingArrays(int capacity) throws Exception {
			if (capacity <= 0) {
				System.out.println("Invalid Capacity");
			}
			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
			    
			    int[] temp = new int[2 * data.length];
			    for(int i = 0;i < data.length;i++){
			        temp[i] = data[i];
			    }
			    
			    data = temp;
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}

		public int top() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}

		public void display() throws Exception {
			if (this.size() == 0) {
				throw new Exception("No code");
			}
			else {
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}}

		}

	}

}

