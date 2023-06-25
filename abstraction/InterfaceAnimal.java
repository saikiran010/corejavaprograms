package abstraction;

public interface InterfaceAnimal {
     void bark();
}
class Dog implements InterfaceAnimal{
	public void bark() {
		System.out.println("Dog barking");
	}
}

