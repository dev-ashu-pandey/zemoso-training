package ashutosh.assignment.roddants;

abstract class Rodent {
    public Rodent() {
        System.out.println("Rodent class constructor called");
    }
    public void eat() {
        System.out.println("Rodent is eating");
    }
    public void run() {
        System.out.println("Rodent is running");
    }
    public abstract void sleep();
}
