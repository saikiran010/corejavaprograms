package abstraction;

public class TestMarks {

	public static void main(String[] args) {
		Marks s1=new A(75,76,77);
        System.out.println("The Marks percentage of Student A :"+s1.getPercent());
        Marks s2=new B(95,96,97,98);
        System.out.println("The Marks percentage of Student B :"+s2.getPercent());
	}

}
