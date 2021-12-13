package backtracking;
import java.util.*;
public class Binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       
        int k = sc.nextInt();
        while(k>0){
            int n =sc.nextInt();
             binary(n);
             k--;
        }
        
    }
    public static void binary(int n ){
        int[] arr = new int[n];
        arr[0]=2;
        arr[1]=3;
        for(int i = 2 ;i<n;i++){
            arr[i]= arr[i-1] + arr[i-2];
        }
        System.out.print(arr[n-1]+"\n");
    }
}