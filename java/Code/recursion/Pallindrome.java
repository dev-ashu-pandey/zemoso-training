package recursion;

public class Pallindrome {
	public static boolean pallindrome(int n) {
		int a=n;
		int digit=(int)Math.log10(n)+1;
		a=rev(a,digit);
		if(n==a) return true;
		return false;
	}
	public static int rev(int n,int digit) {
		if(n%10==n)return n;
		return (int)((n%10)*Math.pow(10, digit-1))+ rev(n/10,--digit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pallindrome(1321));

	}

}
