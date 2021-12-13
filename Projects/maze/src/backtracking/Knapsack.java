package backtracking;
import java.util.*;
public class Knapsack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int w =sc.nextInt();
		int[] weight = new int[n];
		for(int i =0;i<n;i++) {
			weight[i]=sc.nextInt();
		}
		int[] val = new int[n];
		for(int i =0;i<n;i++) {
			val[i]=sc.nextInt();
		}
		long res =knapsack(weight,val,w);
		System.out.println(res);


	}
	public static long knapsack(int[] weight,int[] val,int w) {
		long[] max1 = new long[w+1];
		for(int i =0;i<=w;i++) {
			for(int j =0;j<weight.length;j++) {
				if(weight[j]<=i) {
					if(max1[i] > max1[i-weight[j]]+val[j]) {
						max1[i]=max1[i];
					}
					else {
						max1[i]=max1[i-weight[j]]+val[j];
					}
				}
			}
		}
		return max1[w];
	}

}
