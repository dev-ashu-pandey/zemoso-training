package traversing;
import java.util.*;
public class Traversal {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Ashutosh");
        names.add("Zainul");
        names.add("Sagar");
        names.add("Rahul");
        names.add("Devanshi");

        //for each loop:
        for(String str:names)
        {
            System.out.print(str +"\t"+str.length()+"\t");
            StringBuffer br=new StringBuffer(str);
            System.out.println(br.reverse());
        }
        System.out.println("________________________");

        //traversing using ITERATOR: Forward traversing
        Iterator<String> itr = names.iterator();

        while(itr.hasNext())
        {
            String next = itr.next();
            System.out.println(next);
        }
        System.out.println("+++++++++++++++++++++++");

        //backward traversal of collection LISTITERATOR
        ListIterator<String> litr = names.listIterator(names.size());
        while(litr.hasPrevious())
        {
            String previous = litr.previous();
            System.out.println(previous);
        }


        System.out.println("++++++++Enumeration+++++++++++++");
        //Enumeration
        Vector<String> vec=new Vector<>();
        vec.add("Ashutosh");
        vec.add("Zainul");
        vec.add("Sagar");
        vec.add("Rahul");
        vec.add("Devanshi");
        Enumeration<String> enumeration=vec.elements();
//        only for traversing in forward direction and only used for read operation
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
        System.out.println("++++++++FOR EACH METHOD+++++++++++++");
        //for each method

        names.forEach(str->{
            System.out.println(str);
        });

        System.out.println("SORTING OF ELEMENTS");
        TreeSet<String> set=new TreeSet<>();
        set.addAll(names);
        set.forEach(e->{
            System.out.println(e);
        });

    }
}