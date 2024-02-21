package string;

public class Performance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String series ="";
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			series+=ch;
		}
		System.out.println(series);
		// this is bad solution because in every iteration it is creating a new obejct and old one is wasted.
		// due to this so much memory is wasted
		// a,ab,abc,abcd,........,abcdefg....y these all are deallocate because in the last series is
		// pointed to abcdefg......z 
		// so time complexity is O(n^2)
		
		// for the solution of this problem we make string builder

	}

}
