package relationship;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person p1=new Person();
         p1.display();
         System.out.println("-----------------------------------");
         Person p2=new Person(102,"Saikiran",new MyDate(13,5,2001));
         p2.display();
	}

}
