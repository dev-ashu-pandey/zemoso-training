package recursion;

import java.util.Arrays;

public class BubbleSortRecursion {
	public static void bubble(int []a,int i,int n) {
		if(n==0)return;
		if(i<n) {
			if(a[i]>a[i+1]) {
//				swap(a[i],a[i+1]);
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}			
			bubble(a,i+1,n);
		}else {
			bubble(a,0,n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {4,2,9,3,5,7,8};
		bubble(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
