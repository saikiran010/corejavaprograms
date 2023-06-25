package abstraction;

public abstract class Bank1 {
   public abstract double getBalance();
}
class BankA extends Bank1{
	@Override
	public double getBalance(){
		return 100.0;
	}
}
class BankB extends Bank1{
	@Override
	public double getBalance(){
		return 150.0;
	}
}
class BankC extends Bank1{
	@Override
	public double getBalance(){
		return 200.0;
	}
}


