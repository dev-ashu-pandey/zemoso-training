package string;

import java.util.ArrayList;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('a'+'b');// converting string into ascii valuue and add them
		System.out.println("a"+"b");// concatenating string
		System.out.println('a'+3);
		System.out.println((char)('a'+3));
		System.out.println("a"+1);// integer is converted into string and then concatenate it.
		System.out.println("Ashu"+ new ArrayList<>());// concatenate an empty list with Ashu.
		System.out.println(new Integer(43)+""+new ArrayList<>());
		//+ operator work on primitive type or an expression in which one of them is string. else it will give error
		// + is only operator which is overloaded other operator not
	}

}
