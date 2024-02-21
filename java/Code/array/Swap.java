package array;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int [] arr= {1,2,3,4,5,6,7};
		swap(arr,1,3);
		System.out.println(arr[1]+" "+arr[3]);
	}
	static void swap(int []arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}
