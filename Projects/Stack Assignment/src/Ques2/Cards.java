/*You are at a casino. There are N stacked cards on pile . Each card has a number written on it. 
 * Then there will be Q iterations. In ith iteration, you start picking up the cards in Ai-1th pile from the top 
 * one by one and check whether the number written on the card is divisible by the ith prime number. 
 * If the number is divisible, you stack that card on pile Bi. Otherwise, you stack that card on pile Ai. 
 * After Q iterations, cards can only be on pile B1, B2, B3, . . . BQ, AQ . 
 * Output numbers on these cards from top to bottom of each piles in order of B1, B2, B3, . . . BQ, AQ .*/
 
package Ques2;
import java.util.*;
public class Cards {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> s = new Stack<Integer>();
		int n = sc.nextInt();
		int q = sc.nextInt();
		
		
		
		
		
		int a;
		for(int i =0;i<n;i++) {
			a=sc.nextInt();
			s.push(a);
		}
		cards(s,q);
		
	}
public static void cards(Stack<Integer> s,int q ) {
	Stack<Integer> a1= new Stack<Integer>();
	Stack<Integer> a2= new Stack<Integer>();
	int j =0;
	while(j<q) {
		long prime = prime(j+1);
		System.out.println(prime);
		
		while(!s.isEmpty()){
			int n = s.peek();
			s.pop();
			if(n%prime!=0) {
				a1.push(n);
			}
			else {
				a2.push(n);
			}
		}
		while(!a2.isEmpty()) {
			System.out.println(a2.peek());
			a2.pop();
		}
		s=a1;
		if(!a1.isEmpty()) {
			a1=new Stack<>();
		}
		j++;
	}
	
	
	while(!s.isEmpty()) {
		System.out.println(s.peek());
		s.pop();
	}
}
	
public static boolean isPrime(long num) {
	if(num<2) {
		return false;
	}
	for(long i =2;i<num/2+1;i++) {
		if(num%i==0) {
			return false;
		}
	}
	return true;
}
public static long prime(long q ) {
	long count=0;
	long i =2;
	while(count<q) {
		if(isPrime(i)) {
		count=count+1;
		}
		i++;
	}
	return i-1;
	
}
	}
		


