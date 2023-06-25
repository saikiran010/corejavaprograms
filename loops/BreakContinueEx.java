package loops;

public class BreakContinueEx {

	public static void main(String[] args) {
		System.out.println("Break : terminating the execution");
		for(int i=1;i<10;i++) {
			if(i==5)
				break;
		System.out.println(i);
		}
		System.out.println("Continue: skip the one iteration and move to the next iteraton");
		for(int i=1;i<10;i++) {
			if(i==5 || i==6)
				continue;
		System.out.println(i);
		}
	}

}
