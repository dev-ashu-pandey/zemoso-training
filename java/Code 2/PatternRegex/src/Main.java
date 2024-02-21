import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.printf("RegEx example");
        System.out.println("Metacharacter D");// D=> non digit
        System.out.println(Pattern.matches("D","1"));// false
        System.out.println(Pattern.matches("D","122"));// false
        System.out.println(Pattern.matches("D","ab"));// false non digit but comes more than one time
        System.out.println(Pattern.matches("D","a"));// true


        System.out.println("Metacharacter D with Quantifier");
        System.out.println(Pattern.matches("D*","abc"));// true=> non digit and can occur more than one time
        System.out.println(Pattern.matches("D+","abb"));
    }
}