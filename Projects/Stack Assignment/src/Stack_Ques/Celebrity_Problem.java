package Stack_Ques;
import java.util.*;
public class Celebrity_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a= {{0 , 1 , 1, 1},{1,0,1,0},{0,0,0,0},{1,1,1,0}};
		Stack<Integer> s= new Stack<Integer>();
		for(int i =0;i<4;i++) {
			s.push(i);
		}
		while(s.size()!=1) {
			int a1 = s.pop();
			int a2=s.pop();
			if(a[a1][a2]==0) {
				s.push(a1);
			}
			else {
				s.push(a2);
			}
		}
		int candidate = s.pop();
		for(int i =0;i<a.length;i++) {
			if(i!=candidate) {
				if(a[candidate][i]==1 || a[i][candidate]==0) {
					System.out.println("No celebrity");
					return;
				}
			}
			
		}
		System.out.println(candidate);
		
	}

}
