package classesAndObject;
class P{
	int i;
	String name;
	float f;
	P(){
		i=10;
		name="Ashu";
		f=2.2f;
	}
	void P() {
		System.out.println("hello i am duplicate of constructor");
	}
}
class C{
	int i;
	String name;
	float f;
	C(int x,String n,float y){
		i=x;
		n=name;
		y=f;
	}
}
public class Constructorinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P obj1=new P();
		System.out.println(obj1.i+" "+obj1.name+"  "+obj1.f);
		obj1.P();
		//C obj2=new C();--> This give error
	}

}
