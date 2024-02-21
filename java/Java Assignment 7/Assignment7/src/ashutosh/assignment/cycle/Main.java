package ashutosh.assignment.cycle;

public class Main {
    public static void main(String[] args) {
        UniCycle uniCycle=new UniCycle();
        BiCycle biCycle=new BiCycle();
        TriCycle triCycle=new TriCycle();
        //Upcast the instance into array Cycle
        Cycle []cycle=new Cycle[3];
        cycle[0]=uniCycle;
        cycle[1]=biCycle;
        cycle[2]=triCycle;
//        cycle[0].balance();// we are not able to access because it
//        Downcast to UniCycle
        ((UniCycle) cycle[0]).balance();
//        Downcast to BiCycle
        ((BiCycle) cycle[1]).balance();
//        Downcast to TriCycle
//        ((TriCycle) cycle[2]).balance(); // it does not have any balance method so it will give error

    }
}
