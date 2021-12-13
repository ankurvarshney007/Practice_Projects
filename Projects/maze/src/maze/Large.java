package maze;
import java.util.*;
public class Large {
	static String max="0";
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		int k = input.nextInt();
		large(s,k);
		System.out.println(max);

	}
	public static void large(String s, int k) {
		
		if(Integer.parseInt(s)>Integer.parseInt(max)) {
			max=s;
		}
		if(k==0) {
			return;
		}
		
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)<s.charAt(j)) {
					s=swap(s,i,j);
					large(s,k-1);
					s=swap(s,i,j);
				}
			}
		}
		
				
	}
	public static String swap(String s,int i ,int j) {
		char ch[] =s.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return new String(ch);
//		String left=s.substring(i);
//		String middle = s.substring(i+1,j);
//		String right =s.substring(j+1);
//		return left+j+middle+i+right;
	}

}
