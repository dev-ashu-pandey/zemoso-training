
import java.util.Scanner;
public class Assignment2 {
//    Time Complexity: O(n)
//    Space Complexity: O(1)
    public static boolean allCharacterPresent(String input){
        boolean res=false;
        boolean []alphabets=new boolean[26];
        for(int i=0;i<input.length();i++){
            char letter=input.charAt(i);
            if((int)letter>=97 && (int)letter<=122)alphabets[letter-'a']=true;
        }
        for(int i=0;i< alphabets.length;i++){
            if(!alphabets[i]) {
                res=true;
                break;
            }
        }
        return res;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your text");
        String input=sc.nextLine().toLowerCase();
        if(!allCharacterPresent(input)){
            System.out.println("Contains all letter from a to z");
        }else{
            System.out.println("Not contains all letter from a to z");
        }
    }
}
