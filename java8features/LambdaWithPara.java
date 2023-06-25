package java8features;

@FunctionalInterface
interface Addable{
	int add(int a,int b);
}

public class LambdaWithPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable a1=(x,y)->x+y;
		
		System.out.println("add : "+a1.add(28, 32));
		
		Addable a2=(p,q)->{
			return p+q;
		};
		
		System.out.println("Add : "+a2.add(12, 12));

	}

}
