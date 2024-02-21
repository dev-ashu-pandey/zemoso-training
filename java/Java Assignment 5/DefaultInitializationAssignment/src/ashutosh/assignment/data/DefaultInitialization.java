package ashutosh.assignment.data;

public class DefaultInitialization {
    int integerVal;
    char characterVal;
    public void globalVariablePrint(){
        System.out.println("global Integer value without initialization  "+this.integerVal);
        System.out.println("global Character value without initialization  "+this.characterVal);
    }
    public void localVariablePrint(){
        int localIntegerVar;
        char localCharVar;
//        Local variable without initialization we can't use
//        System.out.println("global Integer value without initialization"+localIntegerVar);
//        System.out.println("global Integer value without initialization"+localCharVar);
    }
}
