package Navigation_Of_IO;

import java.io.File;

public class Directoires {
	public static void main(String[] args) {
		String[] paths;
		File f=null;
		try {
			 f = new File("C:\\Users\\shrishtigupta\\Downloads");
			paths = f.list();
			for(String path : paths) {
				System.out.println(path);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		//mkdri method
		File f1 = new File("C:\\Users\\shrishtigupta\\Downloads\\MyDir");
		if(f1.mkdir()) {
			System.out.println("Success created");
		}
		else {
			System.out.println("Falure");
		}
		
		File f2 = new File("C:\\Users\\shrishtigupta\\Downloads\\MyDir\\Dir\\Folder");
		if(f2.mkdirs()) {
			System.out.println("Sucessful");
		}
		else {
			System.out.println("Failure");
		}
	}
	}


