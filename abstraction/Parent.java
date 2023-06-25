package abstraction;

public abstract class Parent {
    public abstract void message();
}
class Subclass1 extends Parent{
	@Override
	public void message() {
		System.out.println("This is first subClass");
	}
}
class Subclass2 extends Parent{
	@Override
	public void message() {
		System.out.println("This is Second subClass");
	}
}
