package backtracking;

import java.util.Scanner;

public class LCS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		lcs(arr,n);

	}
	public static void lcs(int[] arr , int n ) {
		int[] total = new int[n];
		for(int i =0;i<n; i++) {
			total[i]=1;
		}
		for(int i =1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j] && total[i]<total[j]+1) {
					total[i]=total[j]+1;
				}
			}
		}
		int max =0;
		for(int i =0;i<total.length;i++) {
			if(total[i]>max) {
				max=total[i];
			}
		}
		System.out.println(max);
	}
}
