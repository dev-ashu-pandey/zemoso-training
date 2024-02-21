package functon;
import java.util.Scanner;

public class Swap {
	static void swap(int c,int d) {
		int temp=c;
		c=d;
		d=temp;
		
	}
	//Java is pass by value not by reference
	public static void main(String [] args) {
		int a=20;
		int b=10;
		swap(a,b);
		System.out.println(a+" "+b);
	}
}
