package ashutosh.assignment.overloadedConstructor;
// Create a class with two (overloaded) constructors. Using this,
// call the second constructor inside the first one.
public class ConstructorExample {
    int x;
    int y;
    ConstructorExample(int x){
        this.x=x;
    }
    ConstructorExample(int x,int y){
        this(x);
        this.y=y;
    }
    public static void main(String []args){
        ConstructorExample overloadConstructor=new ConstructorExample(2,4);
        System.out.println(overloadConstructor.x);
        System.out.println(overloadConstructor.y);
    }
}
