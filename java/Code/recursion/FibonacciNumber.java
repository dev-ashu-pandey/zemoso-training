package recursion;

public class FibonacciNumber {
	public static int fib(int n) {
		if(n==0||n==1) {
			//System.out.println(n);
			return n;
		}
		//System.out.println(fib(n-1)+fib(n-2));
		return fib(n-1)+fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(7));
	}

}
