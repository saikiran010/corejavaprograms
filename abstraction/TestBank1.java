package abstraction;

public class TestBank1 {

	public static void main(String[] args) {
		BankA a=new BankA();
		System.out.println("Balance in Bank A :"+a.getBalance());
		BankB b=new BankB();
		System.out.println("Balance in Bank B :"+b.getBalance());
		BankC c=new BankC();
		System.out.println("Balance in Bank C  :"+c.getBalance());

	}

}
