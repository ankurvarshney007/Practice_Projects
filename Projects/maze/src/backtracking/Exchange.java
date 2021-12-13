package backtracking;
import java.util.*;
import java.util.HashMap;
public class Exchange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		HashMap<String,Long> n=new HashMap<String,Long>();
		long res =coins(num,n);
		System.out.println(res);
	}
	public static long coins(int num , HashMap<String,Long> n) {
		if(num==0) {
			return 0;
		}
		if(num==1) {
			return 1;
		}
		if(n.containsKey(""+n)) {
			return n.get(""+n);
		}
		long count =0;
		count = count+coins(num/2,n);
		count=count+coins(num/3,n);
		count = count+coins(num/4 ,n);
		n.put(""+num, Math.max(count,num));
		return Math.max(num, count);
				
		}

}
