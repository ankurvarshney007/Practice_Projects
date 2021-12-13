import java.util.*;
public class Main {
	String value,label;
	Main(String s ,String l){
		value=s;
		label=l;
	}
	public String getLabel() {
		return this.label;
	}
	public String getvalue() {
		return this.value;
	}
	public boolean equals(Object o) {
		Main main = (Main)o;
		return value.equalsIgnoreCase(main.value);
	}
	public static void main(String[] args){
		Main m = new Main("abc","v1");
	Main m1 = new Main("abc","v2");
	Main m2 = new Main("abc","v3");
	ArrayList<Main> l = new ArrayList<>();
	int[] arr = {2,3,4,5,6};
	for(int oyu : arr) {
		System.out.println(m);
	}
	arr.forEach(m -> System.out.println(m));
	l.add(m);
	l.add(m1);
	l.add(m2);
	l.remove(m2);
	for(Main lst:l) {
		System.out.println(lst.getLabel()+lst.getvalue());
		System.out.println();
	}
	
	}
}
	