package recursion;

public class ArrayIsSorted {
	public static boolean isSorted(int[] arr,int i) {
		if(i==arr.length-2)return true;
		return (arr[i]<arr[i+1]) && isSorted(arr,++i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,4,8,3,9,12};
		System.out.println(isSorted(arr,0));

	}

}
