package maze;
import java.util.*;
public class Vivek {
	//static long max  =Integer.MIN_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		while(k>0) {
			int n =sc.nextInt();
			long[] arr = new long[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextLong();
			}
			long score = vivek(arr,0,n);
			System.out.println(score);
			k--;
		}
		

	}
	public static long vivek(long[] arr , int s , int n ) {
		if(n-s==1) {
			return 0;
		}
		if(n==s) {
			return 0;
		}
		if(s<0 || n >arr.length) {
			return 0;
		}
		long max =0;
		
		long left =0;
		for(int i = s;i<n;i++) {
			left+=arr[i];
		}
		long right =0;
		int index=-1;
		for(int i=n-1;i>=s;i--) {
			right+=arr[i];
			left-=arr[i];
			if(left==right) {
				index =i;
			}
		}
		long l=0 ,r =0;
		if(index !=1)	{	
		l= vivek(arr,s,index)+1;
		r=vivek(arr,index,n)+1;
		}
		if(l>r) {
			max= l;
		}
		else {
			max =r;
		}
			
		
		return max;

	}
	}
