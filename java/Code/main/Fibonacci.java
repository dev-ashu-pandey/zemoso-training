package main;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter which number occurence you wan to search:");
		int n=sc.nextInt();
		int count=0;
		int rem;
		while(a>0) {
			rem=a%10;
			a=a/10;
			if(n==rem) {
				count++;
			}
		}
		System.out.println(count);
	}

}
