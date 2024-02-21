package recursion;

import java.util.ArrayList;

public class LinearSearch {
	public static int search(int []arr,int ele,int i) {
		if(i<arr.length) {
			if(arr[i]==ele) return i;
			return search(arr,ele,i+1);			
		}
		return -1;
	}
	static ArrayList<Integer> list1=new ArrayList<>();
	public static void listsearch(int []arr,int ele,int i) {
		if(i<arr.length) {
			if(arr[i]==ele) list1.add(i);
			listsearch(arr,ele,i+1);			
		}
		return;
	}
	public static ArrayList<Integer> listsearch(int []arr,int ele,int i,ArrayList<Integer> list) {
		if(i<arr.length) {
			if(arr[i]==ele) list.add(i);
			listsearch(arr,ele,i+1,list);			
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,1,3,4,4,5,6};
		System.out.println(search(arr,4,0));
		listsearch(arr,4,0);
		System.out.println(list1);
		ArrayList<Integer> l=new ArrayList<>();
		System.out.println(listsearch(arr,4,0,l));

	}

}
