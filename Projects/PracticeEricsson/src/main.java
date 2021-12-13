import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class main {

	public static void main(String[] args) throws Exception {
		int b = 20;
//		practice p = new pp();
//
//		p.show1();
//		p.run();
//		Scanner sc = new Scanner(System.in);
//		Map <String, String> map = new HashMap<>();
//		
//		map.put("shrishti", "Gupta");
//		map.putIfAbsent("shrishti", "Goyal");
//		
//		map.put(null, null);
//		map.putIfAbsent(null, "34");
//		System.out.println(map.get("shrishti"));
//		System.out.println(map.get(null));
//		
//
////		System.out.println();
////		A a = new A();
//		String s = "ABC";
//		String s1= "ABC";
//		if(s==s1) {
//			System.out.println("true");
//		}
////		s1="VFDC";
//		System.out.println(s + " " + s1);
	pp obj = new pp();
	obj.i=10;
	File f = new File("obj.text");
	FileOutputStream fip = new FileOutputStream(f);
	ObjectOutputStream oop = new ObjectOutputStream(fip);
	
	oop.writeObject(obj);
	FileInputStream fop = new FileInputStream(f);
	ObjectInputStream oip = new ObjectInputStream(fop);
	pp obj1 = (pp)oip.readObject();
	System.out.println(obj1.i);
	
	
	}

}
