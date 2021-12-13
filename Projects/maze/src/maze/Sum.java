package maze;
import java.util.*;
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for( int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sum(arr,0,"","",0,0);

	}
	public static void sum(int[] arr,int i,String ans1,String ans2,int left,int rigth) {
		if(left==rigth) {
			System.out.println(ans1 + "and" + ans2);
		}
		if(i>arr.length-1) {
			return;
		}
		if(i>arr.length-2) {
		sum(arr,i+1,ans1+arr[i]+" ",ans2+arr[i+1]+" ",left+arr[i],rigth+arr[i+1]);
		}
		if(i>arr.length-1) {
		sum(arr,i+1,ans1,ans2+arr[i]+" ",left,rigth+arr[i]);
		}
}
}