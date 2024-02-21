package functon;

public class ChangeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6};
		change(arr);
		System.out.println(arr[0]);
	}
	static void change(int []num) {
		num[0]=99;
	}

}
