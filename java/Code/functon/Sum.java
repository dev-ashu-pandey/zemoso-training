package functon;
import java.util.Scanner;
public class Sum {
	public static void sum(int a, int b) {
		int s=a+b;
		System.out.println("The sum of these number is"+s);
	}
	static String greet() {
		
		return "23";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sum(a,b);
		for(int i=0;i<10;i++) {
			System.out.println(greet());
			
		}
	}

}
