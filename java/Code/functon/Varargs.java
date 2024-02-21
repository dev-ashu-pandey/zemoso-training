package functon;

import java.util.Arrays;

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(1,2,3,4);
		multipleTypeArgument(2,3,"Ashu","Rahul","Sagar");

	}
	// Varargs->it is used when we don't know how many argument we are going to used for eg:
	static void sum(int ...a) {// it will take array of int
		int s=0;
		for(int i=0;i<a.length;i++) {
			s=s+a[i];
		}
		System.out.println(s);
	}
	static void multipleTypeArgument(int a,int b,String ...v) {
	//	System.out.println(Arrays.toString(a,b,v));
	}

}
