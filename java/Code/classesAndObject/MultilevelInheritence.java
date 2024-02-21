package classesAndObject;
class Parent1{
	static int i=10;
	Parent1(){
		System.out.println(i);
	}
}
class Child3 extends Parent1{
	Child3(){
		super();//call the parent class constructor
		System.out.println("value of i from child1 class "+i);
	}
}
class Child4 extends Child3{
	Child4(){
		super();//call the parent class constructor
		System.out.println("value of i from child2 "+i);
	}
}
//Heirarichal inhreitence: one (parent) class is extended by more than one class
class Child5 extends Parent1{
	Child5(){
		super();
		System.out.println("child5 heirarichal "+i);
	}
}
public class MultilevelInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child5 obj=new Child5();
	}

}
