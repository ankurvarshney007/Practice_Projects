// next larger of each elememnt of array if not present then it is -1
package Ques4;

import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int t = scn.nextInt();

		while (t > 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();

			nextLarger(arr);

			t--;
		}

	}

	// Function to print Next Greater Element for each element of the array
	public static void nextLarger(int[] arr) {
		Stack<Integer> s = new Stack<Integer>();
		int[] res = new int[arr.length];
		for(int i =arr.length-1;i>=0;i--) {
			while(!s.isEmpty() && s.peek()<=arr[i]) {
				s.pop();
			}
			if(s.isEmpty()) {
				res[i]=-1;
			}
			else {
				res[i]=s.peek();
			}
			s.push(arr[i]);
		}
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]+","+res[i]);
		}
		
}
}