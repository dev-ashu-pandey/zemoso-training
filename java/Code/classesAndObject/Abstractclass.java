package classesAndObject;
abstract class bigman{
	abstract void m1();
	void m2() {
		System.out.println("Parent");
	}
}
class smallman extends bigman{
	void m1() {
		System.out.println("child");
	}
}
public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smallman s=new smallman();
		s.m1();
		s.m2();
	}

}
