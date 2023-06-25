package relationship;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s2=new Student();
		s2.calculate();
		s2.display();
		Student s3=new Student(10,20,30,new Person(102,"akhil",new MyDate(11,5,2000)));
		s3.calculate();
		s3.display();
	}

}
