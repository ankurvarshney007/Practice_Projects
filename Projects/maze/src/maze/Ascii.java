package maze;
import java.util.*;
public class Ascii {
	static ArrayList<String> a = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.nextLine();
		char c = s.charAt(0);
		System.out.println(Character.isDigit(c));
		//ascii(s,"");
		//System.out.println(a);
	}
	public static void ascii(String s,String ans ) {
		if(s.length()==0) {
			a.add(ans);
			return;
		}
		
		if(s.length()>=0) {
		char c=s.charAt(0);
		char code = (char)(c-'1'+'a');
		ascii(s.substring(1),ans+code);
		}
		if(s.length()>=2) {
		int i = Integer.parseInt(s.substring(0,2));
		if(i>0 && i<=26) {
			char code1 = (char)(i+97-1);
			ascii(s.substring(2),ans+code1);
		}
		}
		
		
			
			
		}
	}

