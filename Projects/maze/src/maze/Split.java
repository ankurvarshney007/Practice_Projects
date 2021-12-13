package maze;
import java.util.*;
public class Split {
	static int count =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		split(arr,0,0,0,"","");
		System.out.println(count);

	}
	public static void split(int[] arr,int i, int left_sum,int right_sum,String left_ans , String right_ans) {
		//System.out.println(left_ans + "and " + right_ans);
		
		if(left_sum==right_sum && left_sum!=0 && i==arr.length && right_sum!=0) {
			System.out.println(left_ans+ "and " + right_ans);
			count++;
			return;
		}
		
		if(i>=arr.length) {
			return;
		}
		split(arr,i+1,left_sum+arr[i],right_sum,left_ans+arr[i]+" ",right_ans);
		split(arr,i+1,left_sum,right_sum+arr[i],left_ans,right_ans+arr[i]+" ");
	}

}
