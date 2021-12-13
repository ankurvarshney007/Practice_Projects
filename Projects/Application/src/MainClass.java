
public class MainClass {
	
	private static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[6];
		arr[0]=6;
		arr[1]=4;
		arr[2]=10;
		arr[3]=3;
		arr[4]=0;
		arr[5]=1;
		int temp;
		for (int i=0; i < arr.length;  i++){
			
			for (int j=1 ; j< arr.length -1; j++) {
				
			if (arr[j-1]> arr[j]) {
				// swap elements
				temp= arr[j-1];
				arr[j-1]=arr[j];
			arr[j]=temp;
			}}
			}
for( int i=0; i < arr.length; i++) {
	System.out.println(arr[i]);
}
	}}
