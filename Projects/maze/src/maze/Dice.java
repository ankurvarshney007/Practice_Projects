package maze;
import java.util.*;

public class Dice {
	static int count=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int snake=sc.nextInt();
		int dice=sc.nextInt();
		dice1(snake,dice,"");
		
		System.out.println(count);
		sc.close();
	}
	public static void dice1(int snake,int dice,String ans) {
		int sum=0;
		for(int i =0;i<ans.length();i++) {
			sum=sum+Character.getNumericValue(ans.charAt(i));
			
		}
		
		
		if(sum==snake) {
			System.out.println(ans);
			count++;
			return;
		}
		if(sum>snake) {
			return;
		}
		int j=1;
		while(j<dice) {
			dice1(snake,dice,ans+String.valueOf(j));
			j++;
		}
	}
	

}
