package Methods;

public class ThisConstructor {
	String msg;
	
	public ThisConstructor() {
		this("User");
		System.out.println("hello..."+msg);
	}
	public ThisConstructor(String msg) {
		this.msg=msg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ThisConstructor obj=new ThisConstructor();
	}

}
