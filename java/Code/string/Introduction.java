package string;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Ashu";
		String b="Ashu";
		System.out.println(a==b);
		String name1= new String("Ashu");
		String name2=new String("Ashu");
		System.out.println(name1==name2);
		//when we only need to check the value of reference variable->
		System.out.println(name1.equals(name2));

	}

}
