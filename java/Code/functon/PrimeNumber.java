package functon;
import java.util.Scanner;
public class PrimeNumber {
	static void primeNumber(int n) {
		boolean prime=true;
		if(n>=2) {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					prime=false;
					break;
				}
				else prime=true;
			}			
		}
		else prime=false;
		if(prime) System.out.println(n+" is Prime Number");
		else System.out.println(n+" is not Prime Number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		primeNumber(n);

	}

}
