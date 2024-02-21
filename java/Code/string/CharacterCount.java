package string;

public class CharacterCount {
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
		if(count %2==0) {
			for(int i=0;i<s.length();i++) {
				if(Character.isDigit(s.charAt(i)) && s.charAt(i)%2==0) System.out.print(s.charAt(i));
			}
			for(int i=0;i<s.length();i++) {
				if(Character.isDigit(s.charAt(i)) && !(s.charAt(i)%2==0)) System.out.print(s.charAt(i));
			}
			
		}else {
			for(int i=0;i<s.length();i++) {
				if(Character.isDigit(s.charAt(i)) && !(s.charAt(i)%2==0)) System.out.print(s.charAt(i));
			}
			for(int i=0;i<s.length();i++) {
				if(Character.isDigit(s.charAt(i)) && s.charAt(i)%2==0) System.out.print(s.charAt(i));
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123895#";
		printcount(s);
		
	}

}
