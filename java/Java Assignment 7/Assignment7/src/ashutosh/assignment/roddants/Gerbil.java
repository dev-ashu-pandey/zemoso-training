package ashutosh.assignment.roddants;

public class Gerbil extends Rodent{
    Gerbil(){
        System.out.println("Gerbil constructor is called");
    }
    @Override
    public void sleep() {
        System.out.println("Gerbil is sleeping");
    }
}
