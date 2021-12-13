
public   interface practice {
	int i = 188;
	public void run();
	static  void show() {
		System.out.println("show method of interface");
	}
	default void show1() {
		System.out.println("  default method of interface ");
	}

}
