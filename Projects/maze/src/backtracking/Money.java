package backtracking;
import java.util.*;
public class Money {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int friends = sc.nextInt();
		int weight = sc.nextInt();
		int[] price = new int[weight];
		for(int i=0;i<weight;i++) {
			price[i]=sc.nextInt();
		}
		money(price, weight);

	}
	public static void money(int[] price , int w) {
		Vector<Integer> val =new Vector<Integer>();
		Vector<Integer> weight =new Vector<Integer>();
		int size=0;
		for(int i=0;i<price.length;i++) {
			if(price[i]!=-1) {
				val.add(price[i]);
				weight.add(i+1);
				size++;
			}
		}
		
		
		int[][] min = new int[size+1][w+1];
		for(int i=0;i<=w;i++) {
			min[0][i]=Integer.MAX_VALUE;
		}
		for(int i=1;i<=size;i++) {
			min[i][0]=0;
		}
		
		for(int i =1;i<=size;i++) {
			for(int j =1;j<=w;j++) {
				if(weight.get(i-1)>j) {
					min[i][j]=min[i-1][j];
				}
				else {
					min[i][j]=Math.min(min[i-1][j], min[i][j-weight.get(i-1)]+val.get(i-1));
				}
			}
		}
		if(min[size][w]!=Integer.MAX_VALUE) {
			System.out.println(min[size][w]);
		}
		else {
			System.out.println("-1");
		}
	}

}
