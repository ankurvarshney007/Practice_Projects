package Lambda;
interface executable{
	void grow(String a);
}
interface execute{
	int grow1();
	//int grow2(int a);
}
interface execute1 {
	int grow(int a);
}

public class Runner {
	public void run(executable e) {
		System.out.println("Fucntion run");
		e.grow("Shrishti");
	}
	public void run1(execute a) {
		System.out.println("Function run1 interface execute with return type");
		int ans=a.grow1();
		System.out.println(ans);
		
	}
	/*public void run2(execute b) {
		System.out.println("Function run1 interface execute with return type");
		int ans=b.grow2(10);
		System.out.println(ans);
		
	}*/
	public void run2(execute1 e) {
		System.out.println("PArameter plus return type");
		int ans = e.grow(10);
		System.out.println(ans);
	}
	public static void main(String[] args) {
		// without using lqmnda expressions
		int c = 100; // it must be effrectively final otherwise it thorws an error
		// Must not do this c= 10;
		Runner runner = new Runner();
		runner.run(new executable(){      /* java anonymous claass*/
			public void grow(String a) {
				System.out.println("Hello there");
			}
			
		});
		runner.run1(new execute() {

			@Override
			public int grow1() {
				// TODO Auto-generated method stub
				int c = 10;
				return 8+c;
			}
			
		});
		runner.run2(new execute1() {

			@Override
			public int grow(int a) {
				// TODO Auto-generated method stub
	// anonymps class have scope so we can defined the declare varibale in abouve method again
				int d = 10;
				return 9+a +c;
			}
			
		});
		
		
		// using lambda expressions 
		Runner run = new Runner();
		run.run((a) -> System.out.println("Hello there using lambda experessions")); 
		
		
		run.run1(() -> {
			System.out.println("Helo there");
			return 7;
		});
		run.run1(() -> 8);
		
		run.run2((a) ->{
			System.out.println("Lambda expressions");
			//int c = 10; // lambda expressions have scope of the methid where they are defined
			return 9+a+c;
		});
				
		//cant defined new variable which is already defined in this method			int c = 10; // but without lambda expressioms we can declare local variables
		
		
		
				
	}
}
