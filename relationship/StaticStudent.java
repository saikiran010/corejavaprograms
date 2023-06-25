package relationship;

public class StaticStudent {
	int id;
	String name;
	static String clgName="LDS";
	public StaticStudent(int id,String name) {
		super();
		this.id=id;
		this.name=name;
	}
	public String toStrin() {
		return "id="+id+" , name ="+name+" , college name= "+clgName;
	}
	static {
		System.out.println("it will call before main()");
	}
	public static void square(int a) {
		System.out.println("Square :"+(a*a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticStudent s1=new StaticStudent(101,"raj");
		StaticStudent s2=new StaticStudent(102,"ajay");
		System.out.println(s1);
		StaticStudent.square(3); // square(3)
        System.out.println(s2);
	}

}
