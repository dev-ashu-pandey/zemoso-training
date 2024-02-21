package arrayList;
import java.util.*;

public class Intro {
    public static void main(String[] args) {
        System.out.println("Welcome to code java collection framework");

       /*
       creating collection

       1)Type Safe- same type of elements(objects) are added to collection
       2)Un Type safe- different types of elements can be added to collection

        */

        //Type safe collection
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ashutosh");
        names.add("Zainul");
        names.add("Sagar");
        names.add("Rahul");
        names.add("Devanshi");
        System.out.println(names);
        //get
//        System.out.println(names.get(0));
//        System.out.println(names.get(1));


        //un type safe
//        LinkedList list = new LinkedList();
//        list.add("Ashutosh");
//        list.add(101);
//        list.add(625.5124);
//        list.add(true);
//        System.out.println(list);

        //remove
        names.remove("Zainul");

        System.out.println(names);

        //size

        System.out.println("SIZE = " + names.size());

        //check item is there or not
        //Student
        System.out.println(names.contains("Ashutosh Pandey"));

        //check for empy
        System.out.println(names.isEmpty());

        //setting value..
        //names.set(1,"Ram");
        names.add(1, "Ram");

        System.out.println(names);

        //remove all elements
//        names.clear();

        System.out.println(names);
        // type safe
        Vector<String> vector = new Vector<>();
        vector.addAll(names);

        System.out.println("VECTOR " + vector);

        System.out.println("_____________________________________");
        // type safe
        //order are not preserved and duplicates are not allowed
        HashSet<Double> nms = new HashSet<>();
        nms.add(14.14);
        nms.add(34.12354);
        nms.add((2354.235));
        nms.add(99.3);
        nms.add(99.3);
        nms.add(5.3);
        System.out.println(nms);
        // untype safe
//        HashSet not = new HashSet();
//        not.add(23);
//        not.add(("Hello"));
//        ArrayList news=new ArrayList();
//        news.add("aaa");
//        news.add(23);
        // sorting functionality is added
        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);


    }
}