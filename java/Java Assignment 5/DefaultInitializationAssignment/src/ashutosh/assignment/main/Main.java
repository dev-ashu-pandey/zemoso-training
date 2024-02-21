package ashutosh.assignment.main;

import ashutosh.assignment.data.DefaultInitialization;
import ashutosh.assignment.singleton.SingletonClass;

public class Main {
    public static  void main(String []args){
        DefaultInitialization defaultInitialization=new DefaultInitialization();
        defaultInitialization.globalVariablePrint();
//        defaultInitialization.localVariablePrint();// this method will print nothing because local variable without initialization give compilation error
        SingletonClass obj1=SingletonClass.getInstance("Hello  string initialized");
        obj1.printString();
    }
}
