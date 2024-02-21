package array;
import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>(10);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			list.add(sc.nextInt());
		}
		System.out.println(list.get(2));
		System.out.println(list);
	}

}
