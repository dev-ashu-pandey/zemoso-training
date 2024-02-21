package main;
import java.util.Scanner;
public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter your name:");
		String a=sc.nextLine();
		System.out.println("Hello "+a+" Enter the  number:");
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		System.out.println("Enter the operator +,-,*,/");
		char c=sc.next().charAt(0);
		if(c=='+') {
			int d=n+b;
			System.out.println(d);
		}
		else if(c=='-') {
			int d=n-b;
			System.out.println(d);
		}
		else if(c=='*') {
			int d=n*b;
			System.out.println(d);
		}
		else {
			 float d=n/b;
			System.out.println(d);
		}

	}

}
