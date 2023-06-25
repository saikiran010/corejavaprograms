package java8features;

interface Sayable{
	public String say();
}

public class LambdaNoPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sayable a1=()->{
			return "Hello User";
		};
		System.out.println(a1.say());

	}

}
