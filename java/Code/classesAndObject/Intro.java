package classesAndObject;

public class Intro {
	int stu_id;
	String name;
	void display() {
		System.out.println(stu_id);
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intro n=new Intro();
		n.stu_id=10;
		n.name="Ashu";
		n.display();
	}

}
