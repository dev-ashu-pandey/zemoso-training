package introLambda;

public class Main {
    public static void main(String []args){

//        MyInterface myinter=new Intro();
//        myinter.hello();
//        implementation using anonymous
        MyInterface anonymous =new MyInterface() {
            @Override
            public void hello() {
                System.out.println("This is first anonymous");
            }
        };
        anonymous.hello();
        MyInterface anonymous2=new MyInterface() {
            @Override
            public void hello() {
                System.out.println("Second anonymous");
            }
        };
        anonymous2.hello();
//        implementation using lambda
        MyInterface lamb=()->{
            System.out.println("This is our lambda");
        };
        lamb.hello();
        MyInterface lamb2=()-> System.out.println("This is second lambda with one liner");
        lamb2.hello();
        Add addition=(a,b)-> a+b;
        System.out.println("addition of 2 and 3 "+addition.sum(2,3));
    }
}
