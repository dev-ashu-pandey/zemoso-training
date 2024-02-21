package exception;

public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10/0;
			System.out.println(a);
			//System.exit(0);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		//there are 100's of catch bloack can bew ritten for one try but all should written in form of child to parent if not then after
		//after execution of parent rest of catch block didnot execute because that catch block
		//is able to handle every type of exception
		catch(Exception e1) {
			System.out.println(e1);
		}
		finally {
			System.out.println("finally always executed.but if exit() method is written anywhere above the finally then it will not execute.");
		}
	}

}
