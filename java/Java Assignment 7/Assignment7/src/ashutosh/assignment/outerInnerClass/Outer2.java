package ashutosh.assignment.outerInnerClass;

public class Outer2 {
    public class Inner2 extends Outer1.InnerClass1 {
        Inner2(Outer1 outer){
            outer.super(24);
            System.out.println("Second inner constructor");
        }
    }

    public static void main(String[] args) {
//        not clarify which part we have to call
        Outer1 outerObj=new Outer1();
        Outer2 outerObj2=new Outer2();
    }
}
