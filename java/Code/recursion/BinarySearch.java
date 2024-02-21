package recursion;

public class BinarySearch {
	public static int BS(int []a, int ele,int start,int end) {
		int mid=start+(end-start)/2;
		if(start<end) {
			if(a[mid]==ele) {
				return mid;
			}else if(a[mid]<ele) {
				return BS(a,ele,mid+1,end);
			}else {
				return BS(a,ele,start,mid-1);
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,3,5,11,43,54,65,76};
		int ele=4;
		System.out.println(BS(a,ele,0,a.length-1));
		

	}

}
