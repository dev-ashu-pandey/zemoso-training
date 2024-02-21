package recursion;

public class ReverseNumber {
	static int sum=0;
	public static void reverse1(int n) {
		if(n==0) return;
		int rem=n%10;
		sum=sum*10+rem;
		reverse1(n/10);
	}
	public static int reverse2(int n) {
		int digit=(int)(Math.log10(n))+1;
		return fun(n,digit);
	}
	public static int fun(int n,int digit) {
		if((n%10)==n)return n;
		return (int)((n%10)*Math.pow(10, digit-1))+fun(n/10,--digit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse1(4231);
		System.out.println(sum);
		System.out.println(reverse2(4231));

	}

}
