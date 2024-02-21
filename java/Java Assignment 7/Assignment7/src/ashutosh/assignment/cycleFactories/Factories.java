package ashutosh.assignment.cycleFactories;

public class Factories {
    public static void main(String[] args) {
        UniCycle uniCycle=new UniCycle();
        BiCycle biCycle=new BiCycle();
        TriCycle triCycle=new TriCycle();
        uniCycle.ride();
        biCycle.ride();
        triCycle.ride();

    }
}
