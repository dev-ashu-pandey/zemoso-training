package assignment8;
import java.util.Scanner;

public class Main{
    static void validAge(int age) throws Exception1, Exception2, Exception3 {
        if(age<18){
            throw new Exception1("You are not eligible by assignment8.Exception1");
//            throw new assignment8.Exception2("You are not eligible by assignment8.Exception2");
//            throw new assignment8.Exception3("You are not eligible by Exception 3");
        }else{
            System.out.println("You are eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age =sc.nextInt();
        try{
            validAge(age);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Finally clause is executed ");
        }

    }
}
