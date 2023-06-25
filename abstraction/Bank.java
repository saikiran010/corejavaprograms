package abstraction;

public abstract class Bank {
	public abstract float getRateOfInterest();
}
class Sbi extends Bank{
	@Override
	public float getRateOfInterest() {
		return 7.5f;
	}
}
class Hdfc extends Bank{
	@Override
	public float getRateOfInterest() {
		return 9.2f;
	}
}