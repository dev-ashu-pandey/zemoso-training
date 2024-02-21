package string;

public class SB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<26;i++) {
			char ch=(char)('a'+i);
			builder.append(ch);
		}
		System.out.println(builder.toString()	);
		// It is not creating two object. It is changing in real object.
		
		System.out.println(builder.charAt(2));
		System.out.println(builder.indexOf("h"));
		System.out.println(builder.reverse());


	}

}
