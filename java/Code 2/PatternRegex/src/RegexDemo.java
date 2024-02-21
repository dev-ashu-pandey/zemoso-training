import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String []args){
        try{
            Scanner sc=new Scanner(System.in);
            while(true){
                System.out.println("Enter regex pattern or enter q for quit");
                String regexPattern=sc.nextLine();
                if(regexPattern.equals('q')) break;
                Pattern pattern=Pattern.compile(regexPattern);
                Matcher matches=pattern.matcher("Welcome to Zemoso Technology");
                boolean found = false;
                while (matches.find()){
                    System.out.println("found the text "+matches.group()
                            +" Starting index "+matches.start()
                            +" Ending index "+matches.end());
                    found=true;
                }
                if(!found){
                    System.out.println("Not found");
                }
                sc.close();
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
