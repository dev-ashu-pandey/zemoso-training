package array;
import java.util.Scanner;
public class MultidimenssionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr2d[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<arr2d[i].length;j++) {
				arr2d[i][j]=sc.nextInt();
			}
		}
	}

}
