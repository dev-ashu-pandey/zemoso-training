package array;
import java.util.Scanner;
public class ReverseArray {
	static void reverse(int []arr) {
		int start=0;
		int end=arr.length-1;
		while(start<=arr.length/2) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" , ");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" , ");
			
		}
		System.out.println();
		reverse(arr);
	}

}
