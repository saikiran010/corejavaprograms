package abstraction;

public abstract class A1 {
   public A1() {
	   System.out.println("Abstract class A1 ");
   }
   public abstract void aMethod(); 
   public void bMethod() {
	   System.out.println("This is a normal method of abstract class ");
   }
}
class SubClass extends A1{
	@Override
	public void aMethod() {
		System.out.println("This is abstract Class ");
	}
}
