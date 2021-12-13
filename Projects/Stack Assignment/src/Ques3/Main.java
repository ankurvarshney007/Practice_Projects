/*Find the largest rectangular area possible in a given histogram where the largest rectangle can be made
of a number of contiguous bars.*/
package Ques3;

import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0;i < n;i++)
		    arr[i] = s.nextInt();
		    
    		Main mainobj = new Main();
    		StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
    		System.out.println(hist(arr, stack));
		}
	

	public static long hist(int[] arr, StacksUsingArrays stack) throws Exception {
		long area=0;
		int i =0;
		long max=0;
		while(i<arr.length) {
			if(stack.isEmpty() || arr[i]>=arr[stack.top()]) {
				stack.push(i);
				i++;
			}
			else {
				while(!stack.isEmpty() && arr[stack.top()]>=arr[i]) {
				int top =stack.top();
				stack.pop();
				if(!stack.isEmpty()) {
					area = arr[top]*(i-top-1);
				}else {
					area = arr[top]*(i);
				}
				
				if(area>max) {
					max =area;
				}
				
			}}
		}
		while(!stack.isEmpty()) {
			int top = stack.top();
			stack.pop();
			area= arr[top]*(stack.isEmpty()?i:i-stack.top()-1);
			if(area>max) {
				max =area;
			}
		}
		return max ;

	    //Write Your Code here
	    
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
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
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
				throw new Exception("Stack is Empty");
			}
			for (int i = this.tos; i >= 0; i--) {
				System.out.println(this.data[i]);
			}

		}

	}

}

