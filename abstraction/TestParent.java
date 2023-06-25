package abstraction;

public class TestParent {

	public static void main(String[] args) {
		Subclass1 s1=new Subclass1();
        s1.message();
        Parent s2=new Subclass2();
        s2.message();
	}

}
