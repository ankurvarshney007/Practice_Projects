package backtracking;
import java.util.*;
public class Knight {
	static int count =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		knight(arr,0,0,n,"" );
		System.out.println("\n"+ count );

	}
	public static void knight(int[][] arr, int row , int col,int N,String ans) {
		/*if(col==n) {
			knight(arr,row+1,0,k,n);
			return;
		}*/
		
		
		if(N==0) {
			System.out.print(ans+ "  ");
			count++;
			return;
		}
		if(row==arr.length || col==arr.length) {
			return;
		}
		
		for(int i = row ;i<arr.length;i++) {
			for(int j =col;j<arr.length;j++) {
				if(isSafe(arr,i,j) && arr[i][j]!=1) {
					arr[i][j]=1;
					knight(arr,i,j,N-1,ans+"{"+i+"-"+j+"}"+" ");
					arr[i][j]=0;
				}
			}
			col=0;
			
		}
		
	
	}
	public static boolean isSafe(int[][] arr , int cr ,int cc) {
		
	
		int row = cr-2;
		int col = cc-1;
		if(row >=0 && col<arr.length && col>=0 && arr[row][col]==1) {
			return false ;
		}
		row = cr-2;
		col=cc+1;
		if(row>=0 && col<arr.length && arr[row][col]==1) {
			return false ;
		}
		row = cr-1;
		col = cc-2;
		if(row>=0 && col<arr.length && col>=0 && arr[row][col]==1) {
			return false ;
		}
		row= cr-1;
		col=cc+2;
		if(row>=0 && col<arr.length && col>=0 && arr[row][col]==1) {
			return false;
		}
		return true;
	}

}
