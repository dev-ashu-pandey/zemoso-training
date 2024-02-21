package ashutosh.assignment.roddants;

public class Hamster extends Rodent{
    Hamster(){
        System.out.println("Hamster constructor is called");
    }
    @Override
    public void sleep() {
        System.out.println("Hamster is sleeping");
    }
}
