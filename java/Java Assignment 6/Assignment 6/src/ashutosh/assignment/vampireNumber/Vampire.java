package ashutosh.assignment.vampireNumber;

import java.util.ArrayList;

//A vampire number v is a number with an even number of digits n, that can be factored into
// two numbers x and y each with n/2 digits and not both with trailing zeroes, where v contains
// precisely all the digits from x and from y, in any order.
// Write a java program to print first 100 vampire numbers.
public class Vampire {
    public static boolean notContainTrailingZero(long num){
        return (num%10 == 0);
    }
    public static boolean isValidPair(long x, long y,String v){
        String strX=x+"";
        String strY=y+"";
        if(notContainTrailingZero(x) && notContainTrailingZero(y)){
            return false;
        }
        char []tempCharArray=v.toCharArray();
        for(char tempVal:(strX+strY).toCharArray()){
            int index=v.indexOf(tempVal);
            if(index==-1) return false;
            tempCharArray[index]=' ';
        }
        for(char ch:tempCharArray){
            if(ch!=' ') return false;
        }
        return true;
    }
    public static  boolean findVampire(long n){
        String digit=""+n;
        int numOfDig=digit.length();
        if(numOfDig%2!=0) return false;
        else{
            ArrayList<Integer> factor=new ArrayList<>();
            for(long i=2;i<Math.sqrt(n)+1;i++){
                int lengthI=(""+i).length();
                if(n%i==0 && lengthI==numOfDig/2) {
                    long y=n/i;
                    if(isValidPair(i,y,digit)) return true;
                }
            }
        }
        return false;
    }
    public static void main(String []args){
        ArrayList<Long> vampireList=new ArrayList<>();
        long number=10;
        while(vampireList.size()!=100){
            if(findVampire(number)) vampireList.add(number);
            number++;
        }
        System.out.println( vampireList.toString());
    }
}
