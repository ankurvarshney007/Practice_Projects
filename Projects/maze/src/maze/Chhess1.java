package maze;

import java.util.*;
public class Chess1 {
    static int count=0;
    public static void main(String args[]) {
        
    Scanner sc = new Scanner(System.in);
		int board = sc.nextInt();
		chess(0,0,board-1,board-1,"{0-0}");
        System.out.print("\n"+count);

	}
    public static void chess(int cr, int cc, int er, int ec, String ans ) {
		if(er==cr && ec == cc) {
			System.out.print(ans+" ");
            count++;
			return;
		}
		if(cr>er || cc>ec) {
			return;
		}
		chess(cr+2,cc+1,er,ec,ans+"K"+"{"+(cr+2)+"-"+(cc+1)+"}");
		chess(cr+1,cc+2,er,ec,ans+"K"+"{"+(cr+1)+"-"+(cc+2)+"}");
		if(iswall(cr,cc,er,ec)) {
			int i=1;
			while(i<=ec-cc) {
				chess(cr,cc+i,er,er,ans+"R"+"{"+(cr)+"-"+(cc+i)+"}");
				i++;
			}
			int j=1;
			while(j<=er-cr) {
				chess(cr+j,cc,er,ec,ans+"R"+"{"+(cr+j)+"-"+(cc)+"}");
				j++;
			}
		}
		if(cr==cc || cr+cc==er) {
			int k=1;
			while(k<=ec-cc) {
				chess(cr+k,cc+k,er,ec,ans+"B"+"{"+(cr+k)+"-"+(cc+k)+"}");
				k++;
			}
		}
        
		
	}
    public static boolean iswall(int cr,int cc, int er, int ec) {
		if(cr==0 || cc==0 || cr==er || cc==ec) {
			return true;
		}
		return false;
	}
}
