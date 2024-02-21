package recursion;

public class PatternusingRecursion {
	public static void rightTriangle(int r,int c) {
		if(r==0) return;
		if(r>c) {
			rightTriangle(r,c+1);
			System.out.print("* ");
		}
		else {
			c=0;
			rightTriangle(r-1,c);
			System.out.println();
		}
	}
	public static void pattern1(int r,int c) {
		if(r==0) return;
		if(r>c) {
			System.out.print("* ");
			pattern1(r,c+1);
		}
		else {
			c=0;
			System.out.println();
			pattern1(r-1,c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern1(4,0);
		rightTriangle(4,0);
	}

}
