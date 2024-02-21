package main;
import java.util.Scanner;
public class Largest {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=a;
		if(b>max) {
			max=b;
		}
		if(c>max) {
			max=c;
		}
		System.out.println("The laeger number is "+max);
	}

}
