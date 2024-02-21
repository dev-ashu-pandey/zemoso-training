package recursion;

public class FiboUsingFormula {
	public static long fibo(int n) {
		return (long)((Math.pow(((1+Math.sqrt(5))/2),n))/Math.sqrt(5));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<11;i++) {
			System.out.println(fibo(i));
		}

	}

}
