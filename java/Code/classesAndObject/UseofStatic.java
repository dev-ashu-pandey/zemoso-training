package classesAndObject;
class Student{
	static int stu_num=0;
	Student(){
		stu_num++;
	}
}
public class UseofStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		System.out.println(s4.stu_num);
	}

}
