package maze;
import java.util.*;

public class Binary {
	public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        sc.nextLine();
        
        while(test>0){
            String s = sc.nextLine();
            binary(s,"",0);
            test--;
        }
        sc.close();
    }
    public static void binary(String s,String ans, int pos){
        if(pos==s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(pos)=='?'){
            binary(s,ans+"0",pos+1);
            binary(s,ans+"1",pos+1);
        }
        else{
            binary(s,ans+s.charAt(pos),pos+1);
        }
        }
    }




