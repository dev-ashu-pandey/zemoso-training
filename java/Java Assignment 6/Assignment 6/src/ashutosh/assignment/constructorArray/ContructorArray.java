package ashutosh.assignment.constructorArray;
//3. Create a class with a constructor that takes a String argument.
// During construction, print the argument. Create an array of object references to this class,
// but don’t actually create objects to assign into the array. When you run the program,
// notice whether the initialization messages from the constructor calls are printed.
//
// 4. Complete the previous exercise by creating objects to attach to the array of references.
public class ContructorArray {
    ContructorArray(String str){
        System.out.println(str);
    }
    public static void main(String []args){
        ContructorArray []arr=new ContructorArray[3];// here nothing will be printed
        arr[0]=new ContructorArray("Hello 1");
        arr[1]=new ContructorArray("Hello 2");
//        here the value will be printed because actual creation is done over here
    }
}
