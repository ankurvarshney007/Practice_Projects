package backtracking;
import java.util.*;
public class Coins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long[] s= new long[(int)m];
		for(int i =0;i<m;i++) {
			s[i]=sc.nextLong();
		}
		long res =coin(s,n);
		System.out.println(res);

	}
	public static long coin(long[] s,long n ) {
		long way[] = new long[(int)n+1];
		way[0]=1;
		for(int i=0;i<s.length;i++) {
			for(int j =0;j<way.length;j++) {
				if(s[i]<=j) {
					way[j]=way[j]+way[(int)(j-s[i])];
				}
			}
		}
		return way[(int)n];
		
	}

}
