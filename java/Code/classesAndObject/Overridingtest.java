package classesAndObject;
import functon.*;
class over{
	void m1() {
		System.out.println("Parrent");
	}
}
class my extends over{
	//Method override
	void m1() {
		System.out.println("Child");
	}
}
public class Overridingtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my obj=new my();
		obj.m1();
		Sum n=new Sum();
		n.sum(1,2);

	}

}
