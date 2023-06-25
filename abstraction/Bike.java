package abstraction;

public abstract class Bike {
    public Bike() {
    	System.out.println("Constructor in abstract class Bike");
    }
    public void changeGear() {
    	System.out.println("Non - abstract method :Change Gear");
    }
    public abstract void run();
}
