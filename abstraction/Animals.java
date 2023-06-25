package abstraction;

public abstract class Animals {
      public abstract void cats();
      public abstract void dogs();
}
class Cats extends Animals{
	@Override
	public void cats(){
		System.out.println("Cats Meow");
	}

	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		
	}
}
class Dogs extends Animals{
	@Override
	public void dogs(){
		System.out.println("Dogs bark");
	}

	@Override
	public void cats() {
		// TODO Auto-generated method stub
		
	}

}
