package backtracking;
import java.util.*;
public class Lcs3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1= sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		int res =lcs(s1,s2,s3,s1.length(),s2.length(),s3.length());
		System.out.println(res);
	}
	public static int lcs(String S1, String S2,String S3,int s1,int s2,int s3) {
		int[][][] a = new int[s1+1][s2+1][s3+1];
		for(int i =0;i<=s1;i++) {
			for(int j=0;j<=s2;j++) {
				for(int k=0;k<=s3;k++) {
					if(i==0 || j ==0 || k==0) {
						a[i][j][k]=0;
					}
					else if(S1.charAt(i-1)==S2.charAt(j-1) && S1.charAt(i-1) == S3.charAt(k-1)) {
						a[i][j][k]=a[i-1][j-1][k-1]+1;
						
					}
					else {
						a[i][j][k]=Math.max(Math.max(a[i-1][j][k], a[i][j-1][k]),a[i][j][k-1]);
					}
				}
			}
			
		}
		return a[s1][s2][s3];
		
	}
	

}
