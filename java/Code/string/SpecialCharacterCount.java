package string;

public class SpecialCharacterCount {
	public static int countCharacter(String s) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))) {
				count++;
			}
		}
		return count;
	}
	public static void printcount(String s) {
		int count=countCharacter(s);
		StringBuilder listNum=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				listNum.append(s.charAt(i));
			}
		}
		//System.out.println(listNum);
		char [] charArray=new char[listNum.length()];
		listNum.toString().getChars(0, listNum.length(), charArray, 0);
		int [] arr=new int[listNum.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=charArray[i]-'0';
		}
		/*for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		if(count %2==0) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) System.out.print(arr[i]);
			}
			for(int i=0;i<arr.length;i++) {
				if(!(arr[i]%2==0)) System.out.print(arr[i]);
			}
			
		}else {
			for(int i=0;i<arr.length;i++) {
				if(!(arr[i]%2==0)) System.out.print(arr[i]);
			}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0) System.out.print(arr[i]);
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123895#";
		printcount(s);

	}

}
