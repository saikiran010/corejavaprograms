package relationship;

public class TestSalesPerson {

	public static void main(String[] args) {
		SalesPerson p1=new SalesPerson();
		p1.calculate();
		p1.display();
		System.out.println("---------------------------------");
		SalesPerson p2=new SalesPerson(102,"Raju",new MyDate(12,6,2001),20,2000,0.9);
		p2.calculate();
		p2.display();
	}

}
