package string;
import java.util.Scanner;
public class Pallindrome {
	static boolean isPalindrome(String str) {
		str=str.toLowerCase();
		for(int i=0;i<=str.length()/2;i++) {
			char start=str.charAt(i);
			char end=str.charAt(str.length()-1-i);
			if(start!=end) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		// first way
		System.out.println("Enter string :");
		String str=sc.nextLine();
		System.out.println(isPalindrome(str));
		

	}

}
