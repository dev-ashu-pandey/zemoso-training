package classesAndObject;
class memberacc{
	int h=2;
	public int i=10;
	protected int j=20;
	private int k=30;
}
class member extends memberacc{
	void m1() {
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		//System.out.println(k);  only access inside the class whom it will declared
	}
}
public class MemeberaccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		member n=new member();
		memberacc n1=new memberacc();
		n.m1();
		//System.out.println(n1.j);
		}
}
