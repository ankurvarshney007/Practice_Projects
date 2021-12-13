package backtracking;
import java.util.*;

public class Minimum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		int t = sc.nextInt();
		while(t>0) {
			int n = sc.nextInt();
			long arr[]= new long[n];
			for(int i =0;i<n;i++) {
				arr[i]=sc.nextLong();
			}
			long res=minimum(arr,n);
			System.out.println(res);
			t--;
		}
		

}
	public static long minimum(long[] arr , int n ) {
		long[] jumps = new long[n];
		jumps[n-1]=0;
		for(int i=n-2;i>=0;i--) {
			int index = n-1-i;
			// if no of steps equal to 0 then we can't move to end of array
			if(arr[i]==0) {
				jumps[i]=0;
			}
			else if(arr[i]>=index) {
				jumps[i]=1;
			}
			else {
				long min = Integer.MAX_VALUE;
				for(int j = i+1;j<=arr[i]+i;j++) {
					
					if(min>jumps[j] && jumps[j]!=0) {
						min=jumps[j];
					}
					if(min!=Integer.MAX_VALUE) {
						jumps[i]=min+1;
					}
					else {
						jumps[i]=0;
					}
					
				}
			}
			
		}
		
		if(jumps[0]!=0) {
			return jumps[0];
			
		}
		else {
			return Integer.MAX_VALUE;
		}
	}
}