package maze;
import java.util.*;
public class Sort2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		for(int i=0;i<n;i++) {
			arr1[i]=input.nextInt();
		}
		for(int j=0;j<m;j++) {
			arr2[j]=input.nextInt();
		}
		int flag =1;
		
		for(int i =0;i<arr1.length;i++) {
			String ans = ""+arr1[i];
			sort(arr1,arr2,i,0,flag,ans);
		}
	}
	public static void sort(int[] arr1 ,int[] arr2, int s1,int s2,int flag,String ans) {
		//System.out.println(s1+" "+s2);
		if(flag==0) {
			System.out.println(ans);
		}
		if(s1>=arr1.length && s2>=arr2.length) {
			//System.out.println("inside");
			//System.out.println(s1+" "+s2);
			return;
		}
		int index =-1;
		if(flag==1 && s2<arr2.length ) {
			
			for(int j=s2;j<arr2.length;j++) {
				if(arr1[s1]<arr2[j]) {
					 index =j;
					 flag=0;
					 sort(arr1,arr2,s1+1,index,flag,ans+" "+arr2[index]);
				}
			}
			return ;
		}
	
	if(flag==0 && s1<arr1.length ) {
		
		for(int j=s1;j<arr1.length;j++) {
			if(arr2[s2]<arr1[j]) {
				 index =j;
				 flag=1;
				 sort(arr1,arr2,index,s2+1,flag,ans+" "+arr1[index]);
			}
		}
		
	}
	
}

}
