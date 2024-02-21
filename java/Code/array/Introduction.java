package array;
import java.util.Scanner;
public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// datatype[] variable_name = new datatype[size]
		int [] arr;
		arr= new int[5];// Creating the actual object in heap memory
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		// For each loop
		for(int num: arr) {
			System.out.print(num);
		}
	}

}
