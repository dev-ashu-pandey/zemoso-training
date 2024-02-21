package ashutosh.assignment.singleton;

public class SingletonClass {
    String str;
    public static SingletonClass getInstance(String inputStr){
        SingletonClass obj=new SingletonClass();
        obj.str=inputStr;
        return obj;
    }
    public void printString(){
        System.out.println("Global non static str is-> "+str);
    }
}
