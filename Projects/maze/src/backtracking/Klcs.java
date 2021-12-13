package backtracking;
import java.util.*;
public class Klcs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] a=new int[n];
		for(int i =0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[] b=new int[m];
		for(int i =0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		lcs(a,b,k);
		
	}
	public static int lcs(int[] a,int[] b , int k) {
		int[][][] r = new int[a.length+1][b.length+1][k+1];
		for(int i=0;i<=a.length;i++) {
			for(int j =0;j<=b.length;j++) {
				for(int m =0;m<=k;m++) {
					if(i==0 || j==0 || k==0) {
						r[i][j][k]=0;
					}
				}
			}
		}
	}

}
