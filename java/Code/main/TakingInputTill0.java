package main;
import java.util.Scanner;
public class TakingInputTill0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=-1;
		int []n=new int[10];
		do {
			i++;
			n[i]=sc.nextInt();
		}while(n[i]!=0);
		int max=n[0];
		for(int j=1;j<n.length;j++) {
			if(max<n[j]) {
				max=n[j];
			}
		}
		System.out.println(max);
		
	}

}
