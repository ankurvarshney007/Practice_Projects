package Recursion;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		String s ="i love india india";
		
		String[] k = s.split(" ");
		//System.out.println(k[0]);
		String m ="";
	for(int i=k.length-1; i>=0 ; i--) {
		m= m+ k[i] + " ";
	}
	System.out.println(m);

	
	Map<String,Integer> map = new HashMap<>();
	for(int i=0;i<k.length ;i++) {
		
		if(map.containsKey(k[i])) {
			map.put(k[i], map.get(k[i])+1);
		}
		else {
			map.put(k[i],1);
		}
	}
	
	for(String key : map.keySet()) {
		System.out.println(key+ "->" + map.get(key));
	}

	}	

}
