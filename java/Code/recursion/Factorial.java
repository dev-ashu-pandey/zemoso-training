package recursion;

public class Factorial {
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		System.out.println(fact(a));

	}

}
