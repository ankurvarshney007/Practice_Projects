package maze;
import java.util.*;
public class Sub{
    static int count=0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sub(str,"");
        System.out.print("\n"+count);

    }
    public static void sub(String str,String ans){
        if(str.length()==0){
            System.out.print(ans+" ");
            count++;
        }
        if(str.length()>0){
        
        	char c =str.charAt(0);
        //sub(str.substring(1),ans+num);
        sub(str.substring(1),ans);
        sub(str.substring(1),ans+c);
        sub(str.substring(1),ans+(int)c);
    }
    }
}
