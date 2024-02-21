package classesAndObject;
interface oldboy{
	public void m1();
	// we cannot override any variable because jvm by default conider as final
	int i=10;
}
interface oldboy2{
	public void m1();
	int i=100;
}
// multiple inheritence is achieved with interface
class newboy implements oldboy,oldboy2{
	public void m1() {
		System.out.println("oldboys");
		System.out.println(oldboy.i);
		System.out.println(oldboy2.i);
	}
}
public class Interfaceclss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newboy n=new newboy();
		n.m1();
	}

}
