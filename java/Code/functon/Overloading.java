package functon;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(20);
		fun("Ashu");

	}
	static void fun(int a) {
		
		System.out.println(a);
	}
	static void fun(String name) {
		System.out.println(name);
	}

}
