package maze;
import java.util.*;
public class Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m;
		
		String s= sc.nextLine();
		String[] parts = s.split(" ");
		n=Integer.parseInt(parts[0]);
		m=Integer.parseInt(parts[1]);
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
			
		}
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();
			
		}
		sort(arr1,arr2,"",n,m,0,true);

	}
	public static void sort(int[] arr1,int[] arr2,String ans,int n,int m,int cur,boolean flag) {
		if(flag) {
			if(ans.length()!=0) {
				System.out.println(ans+" ");
			}
			
		}
		
		
		
	}

}
