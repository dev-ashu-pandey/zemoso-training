package functon;
import java.util.Scanner;
public class ArmstrongNumber {
	static int armStrong(int n) {
		int a,c=0;
		while(n>0) {
			a=n%10;
			a=a*a*a;
			c=c+a;
			n=n/10;
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(n==armStrong(n)) {
			System.out.println("It is an Armstrong number");
		}
		else System.out.println("not an armstrong number");
	}

}
