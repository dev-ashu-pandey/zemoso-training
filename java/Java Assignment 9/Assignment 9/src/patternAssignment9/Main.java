package patternAssignment9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Using the documentation for java.util.regex.Pattern as a resource, write and test a regular expression
// that checks a sentence to see that it begins with a capital letter and ends with a period.

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sentence=sc.nextLine();
        Pattern pattern=Pattern.compile("^[A-Z].+\\.$");
        Matcher matcher= pattern.matcher(sentence);
        if(matcher.matches()){
            System.out.println("Sentence start from capital letter and ends with period");
        }else{
            System.out.println("Sentence not start from capital letter and neither ends with period");
        }
    }
}
