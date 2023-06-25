package abstraction;

public interface Flyable {
    void fly_obj();
}
class Spacecrapt implements Flyable{
	@Override
	public void fly_obj() {
		System.out.println("inside Spacecrapt Class ");
	}
}
class Airplane implements Flyable{
	@Override
	public void fly_obj() {
		System.out.println("inside Airplane Class ");
	}
}
class Helicopter implements Flyable{
	@Override
	public void fly_obj() {
		System.out.println("inside Helicopter Class ");
	}
}
