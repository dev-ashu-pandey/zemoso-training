package main;
import java.util.Scanner;
public class Reverse {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number you want to reverse");
		int n=sc.nextInt();
		int revNum=0;
		int rem;
		while(n>0) {
			rem=n%10;
			n=n/10;
			revNum=revNum*10 +rem;
		}
		System.out.println(revNum);
			
	}

}
