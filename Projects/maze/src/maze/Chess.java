package maze;
import java.util.*;
public class Chess {
    static int count1=0;
    public static void main(String args[]) {
        
    	Scanner sc = new Scanner(System.in);
		int board = sc.nextInt();
		int[][] arr = new int[board][board];
		int count =0;
		for(int i=0;i<board;i++) {
			for(int j=0;j<board;j++) {
				int num = i*board +j+1;
				boolean f = isPrime(num);
				if(f) {
					count=count+1;
				}
				if(f && count%2!=0) {
					arr[i][j]=1;
					
				}
				if(f && count%2==0) {
					arr[i][j]=2;
				}
			}
		}
		for(int i=0;i<board;i++) {
			for(int j=0;j<board;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		chess(arr,0,0,board-1,board-1,"{0-0}");
        System.out.print("\n"+count1);

	}
    public static boolean isPrime(int n) {
    	if(n==1) {
    		return false;
    	}
    	int m =n/2 +1;
    	for(int i=2;i<m;i++) {
    		if(n%i==0) {
    			return false;
    		}
    		
    	}
    	return true;
    }
    public static void chess(int[][] arr,int cr, int cc, int er, int ec, String ans ) {
		if(er==cr && ec == cc) {
			System.out.print(ans+" ");
            count1++;
			return;
		}
		if(arr[cr][cc]==2) {
			//chess(arr,er,ec,er,ec,ans+"P"+"{"+er+"-"+ec+"}");
			System.out.print(ans+"P"+"{"+er+"-"+ec+"}"+ " ");
			count1++;
		}
		if(cr>er || cc>ec) {
			return;
		}
		if(cr+2 <=er && cc+1<= ec && arr[cr+2][cc+1]!=1 ) {
			chess(arr,cr+2,cc+1,er,ec,ans+"K"+"{"+(cr+2)+"-"+(cc+1)+"}");
		}
		if(cr+1<=er && cc+2<= ec && arr[cr+1][cc+2]!=1 ) {
			chess(arr,cr+1,cc+2,er,ec,ans+"K"+"{"+(cr+1)+"-"+(cc+2)+"}");
		}
		if(iswall(cr,cc,er,ec)) {
			int i=1;
			
				while(i<=ec-cc) {
					if(cr<=er && cc+i<= ec &&arr[cr][cc+i]!=1  ) {
						chess(arr,cr,cc+i,er,er,ans+"R"+"{"+(cr)+"-"+(cc+i)+"}");
						
				}
					i++;
			}
			
			int j=1;
			
				while(j<=er-cr) {
					if(cr+j<=er && cc<=ec && arr[cr+j][cc]!=1 ) {
						chess(arr,cr+j,cc,er,ec,ans+"R"+"{"+(cr+j)+"-"+(cc)+"}");
						
					} 
					j++;
				}
			}
			
		
		if(cr==cc || cr+cc==ec ) {
			int k=1;
			
				while(k<=ec-cc) {
					if(cr+k<=er && cc+k<=ec && arr[cr+k][cc+k]!=1 ) {
						chess(arr,cr+k,cc+k,er,ec,ans+"B"+"{"+(cr+k)+"-"+(cc+k)+"}");
						
					}
					k++;
				}
			}
		}
		/*if(arr[cr][cc]==2) {
			chess(arr,er,ec,er,ec,ans+"")
		}*/
		
    

    public static boolean iswall(int cr,int cc, int er, int ec) {
		if(cr==0 || cc==0 || cr==er || cc==ec) {
			return true;
		}
		return false;
	}
}

