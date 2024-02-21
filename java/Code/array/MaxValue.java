package array;
import java.util.Scanner;
public class MaxValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" , ");
			
		}
		System.out.println();
		System.out.println(max(arr));

	}
	static int max(int []arr) {
		int mn=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(mn<arr[i+1]) {
				mn=arr[i+1];
			}
		}
		return mn;
	}
}