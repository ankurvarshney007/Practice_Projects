package backtracking;
import java.util.*;

public class Fruits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		while(k>0) {
			int N = sc.nextInt();
			int[][] arr = new int[N][3];
			for(int i=0;i<N;i++) {
				for(int j =0;j<3;j++) {
					arr[i][j]=sc.nextInt();
				}
			}
				int res =fruits(arr,N);
				System.out.println(res);
				k--;
			}
		}
	
	public static int fruits(int[][] arr , int N) {
		int[][] d = new int[N][3];
		for(int i =0;i<3;i++) {
			d[0][i]=arr[0][i];
			
		}
		for(int i =1;i<N;i++) {
			for(int j=0;j<3;j++) {
				d[i][j]=Math.min(minimum(d[i-1],0,j-1), minimum(d[i-1],j+1,2)) + arr[i][j];
			}
		}
		int r =Integer.MAX_VALUE;
		for(int i =0;i<3;i++) {
			if(d[N-1][i]<r) {
				r=d[N-1][i];
			}
		}
		return r;
	}
	public static int minimum(int[] a,int i,int j) {
		int val=Integer.MAX_VALUE;
		for(int k=i;k<=j;k++) {
			if(a[k]<val) {
				val=a[k];
			}
		}
		return val;
	}

}
