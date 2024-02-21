package ashutosh.assignment.roddants;

public class Mouse extends Rodent{
    Mouse() {
        System.out.println("Mouse class constructor called");
    }
    @Override
    public void sleep() {
        System.out.println("Mouse is sleeping");
    }
}
