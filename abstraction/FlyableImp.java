package abstraction;

public class FlyableImp{
	public static void main(String[] args) {
		 Flyable s=new Spacecrapt();
		 s.fly_obj();
		 Flyable a=new Airplane();
		 a.fly_obj();
		 Flyable h=new Helicopter();
		 h.fly_obj();

	}

}
