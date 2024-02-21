package classesAndObject;
class super1{
	int i=10;
	super1(){
		System.out.println("hello");
	}
}
class childern extends super1{
	childern(){
		// jvm automatically write super()
		System.out.println(super.i);
	}
}
public class UseofSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childern obj=new childern();
	}

}
