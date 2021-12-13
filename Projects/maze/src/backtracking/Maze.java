package backtracking;
import java.util.*;
public class Maze {
	static int count =0;
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[][] a = {{1,2,3} ,{3,4,5}};
	//System.out.println(a[0].length);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int[][] vis = new int[n][m];
//		char[][] arr = new char[n][m];
//		for(int i =0;i<n;i++ ) {
//			String s = sc.next();
//			for(int j =0;j<m;j++) {
//				arr[i][j]= s.charAt(j);
//			}
//		}
//		maze(arr,0,0,n-1,m-1,vis);
//		if(count==0) {
//			System.out.println("NO PATH FOUND");
//		}
//		
	int[] b = {-10,-2,-4,-100,-20};
		System.out.println(jumps(b)); 
	}
	
	public static void maze(char[][] arr, int cr , int cc ,int er , int ec,int[][] vis) {
		if(cr==er && ec == cc) {
			count++;
			vis[cr][cc]=1;
			for(int i=0;i<=er;i++) {
				for(int j=0;j<=ec;j++) {
					System.out.print(vis[i][j]+ " ");
				}
				System.out.println();
			}
			return;
		}
		if(cr>er || cc>ec || cr<0 || cc<0 || arr[cr][cc]=='X' || vis[cr][cc]==1) {
			return;
		}
		vis[cr][cc]=1;
		maze(arr,cr-1,cc,er,ec,vis); 
		maze(arr,cr+1,cc,er,ec,vis);
		maze(arr,cr,cc-1,er,ec,vis);
		maze(arr,cr,cc+1,er,ec,vis);
		vis[cr][cc]=0;
		
	}
	
	public static int problemA(int[] matrix , int cur , int col ) {
		 if(matrix[cur]==9) {
			 return 0;
		 }
//		 if(rows >= matrix.length || columns>= matrix[0].length || rows<0 || columns<0 || arr[rows][columns]==0) {
//			 return 0;
//		 }
		int rInd = cur +1 ;
		int Dind = cur + col ;
		
		if(rInd <matrix.length && Dind < matrix.length  && matrix[rInd]>0 && matrix[Dind]>0) {
			
			return 1 + Integer.min(problemA(matrix , rInd , col), problemA(matrix ,Dind , col));
		}
		
		else if(rInd< matrix.length && matrix[rInd]>0) {
			return 1+ problemA(matrix ,rInd , col);
		}
		else if(Dind < matrix.length && matrix[rInd]>0){
			return 1 + problemA(matrix , Dind , col);

		}
		else {
			return matrix.length;
		}
	
		
		
	}
	
	public static int jumps(int[] jumps_array) {
		
		int[] target = new int[jumps_array.length];
		
		target[0] = jumps_array[0];
		
		for(int i =0 ; i<jumps_array.length ; i++) {
			
			for(int j =1 ; j<=3 ; j++) {
				
				if(i+j<jumps_array.length)
					target[i+j] =Integer.max(target[i] + jumps_array[i+j], target[i+j]) ;
			
		}
		}
		return target[jumps_array.length-1];
	}
	

}
