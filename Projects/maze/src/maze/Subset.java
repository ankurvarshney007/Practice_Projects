package maze;
import java.util.*;
public class Subset {
    static int count=0;
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        subset(arr,0,"",tar);
        System.out.print("\n" + count);
    }
    public static void subset(int[] arr,int index,String ans ,int tar){
       if(tar<0) {
    	   return;
       }
        if(tar==0){
            System.out.print(ans+ "  ");
            count++;
            return;
        }
        if(index < arr.length) {
        subset(arr,index+1,ans+arr[index]+" ",tar-arr[index]);
        subset(arr,index+1,ans,tar);
        }
    }
}
