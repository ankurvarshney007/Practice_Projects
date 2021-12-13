package maze;

public class maze {
	static int count=0;
	public static void maze1(int cr,int cc, int er, int ec,  String ans) {
		
		if(cr ==er && cc==ec) {
			System.out.println(ans);
			count++;
			return;
		}
	
		if(cr>er || cc>ec) {
			return;
		}
		maze1(cr+1,cc,er,ec,ans+"R");
		maze1(cr,cc+1,er,ec,ans+"D");
		if(!(cr-1 < 1)) {
			maze1(cr-1,cc,er,ec,ans+"L");
		}
		if(cc-1< 1) {
			maze1(cr,cc-1,er,ec,ans+"U");
		}
		
		
		
		//System.out.println(count);
	}
	public static void main(String[] args) {
		int N1=3;
		int N2=3;
		//maze1(1,1,N1,N2,"");
		
		//System.out.println(count);
		//System.out.println(fun(4,3));
		binary("1??0?101","",0);
		//name(3,3,"");
		
	}
	public static double fun(int a, int b) {
        if (b == 0) return 1;
        if(b % 2 == 0) return fun(a * a, b / 2);
        return fun(a * a, b/ 2) * a;
    }
	public static void binary(String s,String ans,int pos) {
		
		if(pos==s.length()) {
			System.out.println(ans);
			return;
		}
		if(s.charAt(pos)=='?') {
			binary(s,ans+"0",pos+1);
			binary(s,ans+"1",pos+1);
		}
		else {
			binary(s,ans+s.charAt(pos),pos+1);
	}
	}
	public static void name(int sum, int dice, String ans) {
		int s=0;
		for(int i=0;i<ans.length();i++) {
			s=(ans.charAt(i)) + s;
		}
		if(s==sum) {
			System.out.println(ans);
			return;
		}
		
		int j=1;
		while(j<=dice) {
			//name(sum,dice,ans+str(j));
		}
	}
}

	
