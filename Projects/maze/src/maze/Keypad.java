package maze;
import java.util.*;
public class Keypad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		keypad(s,"");
	}
	public static void keypad(String s,String ans) {
		if(s.length()==0) {
			System.out.println(ans +" ");
			return;
		}
		
		int i =Integer.parseInt(s.substring(0,1));
		
			
	
		if(i>0 && i<=5) {
			int j=0;
		
			while(j<3) {
				char code =(char)(i*3 +94+j);
				keypad(s.substring(1), ans+code);
				j++;
				
			}
		}
		if(i==6) {
			int j=0;
		
			while(j<4) {
				char code =(char)(i*3 +94+j);
				keypad(s.substring(1), ans+code);
				j++;
				
			}
		}
		if(i==7) {
			int j=0;
		
			while(j<3) {
				char code =(char)(i*3 +95+j);
				keypad(s.substring(1), ans+code);
				j++;
				
			}
		}
		if(i==8 ) {
			int j=0;
		
			while(j<2) {
				char code =(char)(i*3 +95+j);
				keypad(s.substring(1), ans+code);
				j++;
				
			}
		}
		if(i==9 ) {
			int j=0;
		
			while(j<2) {
				char code =(char)(i*3 +94+j);
				keypad(s.substring(1), ans+code);
				j++;
				
			}
		}
		
}
}