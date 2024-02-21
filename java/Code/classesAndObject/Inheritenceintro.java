package classesAndObject;
class Parent{
	static int i=10;
	Parent(){
		System.out.println(i);
	}
}
class Child1 extends Parent{
	Child1(){
		super();
		System.out.println("value of i from child1 class "+i);
	}
}
public class Inheritenceintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// single level inheritence
		Child1 obj=new Child1();
	}

}
