package abstraction;

public class Honda extends Bike {
	@Override
	public void run() {
		System.out.println("implemented abstract method : running safely");
	}
	public static void main(String args[]) {
		Bike b=new Honda();
		b.changeGear();
		b.run();
	}

}
