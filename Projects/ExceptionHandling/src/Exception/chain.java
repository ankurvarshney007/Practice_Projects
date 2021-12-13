package Exception;
import java.util.*;

import java.io.IOException;

public class chain {
	public void method1() throws IOException  {
		int var ;
		Scanner sc = new Scanner(System.in);
		var = sc.nextInt();
		
	}
	public static void main(String[] args) {
		chain c = new chain();
		try {
			c.method1();
		}catch(InputMismatchException e) {
			System.out.println(e);
		}catch(IOException ex) {
			System.out.println(ex);
		}
		System.out.println("Hello i am here");
	}
	

}
