package Exception;
import java.util.*;

import com.sun.xml.internal.ws.encoding.soap.SOAP12Constants;

public class exception {
	public  int main1() {
		Scanner sc = new Scanner(System.in);
		int var = 20;
		
		 {
			try {
				String s = sc.nextLine();
				if(s.equalsIgnoreCase("raw")) {
					//throw new Throwable("Wrong argumet");
					throw new IllegalArgumentException("Type can't be this");
				}
				int num = sc.nextInt();
				int ans = var/num;
			}catch(IllegalArgumentException e) {
				System.err.println(e.getMessage());
				//System.err.println("Divide By zero error");
				
				return 3;
			
			}catch(ArithmeticException e1) {
				System.err.println(e1.getMessage());
				return 2;
				
			}
			finally {
				System.err.println("Execution successful");
				System.out.println(Thread.currentThread().getName());
				
				
				
			}
			
	/* we can also handle multiple exceptions in one catch
	 * catch(IllegalArgumentException | ArithmeticException e)
	 * it is valid statement in java 
	 * you can also create customize exceptions in java 
	 * by extending Exception class 
	 * One more thing when we have return statements in both catch amd finally 
	 * statements then catch starements is overridden 		
	 */
			
			
		
	}
		return 4;
	}
	public static void main(String[] args) {
		exception e = new exception();
		int a =e.main1();
		//System.out.println();
		System.out.println(a);
	}
		
}

