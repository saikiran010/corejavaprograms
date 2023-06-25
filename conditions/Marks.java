package conditions;
import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m1,m2,m3,per;
		System.out.println("Enter marks of 3 subjects");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		per=(m1+m2+m3)/3;
		System.out.println("The percentage is : "+per+"%");
		if(m1<35 ||m2<35 ||m3<35)
			System.out.println("Grade : Fail");
		else {
			if(per>90)
				System.out.println("Grade : A+");
			else if(per>80)
				System.out.println("Grade : A");
			else if(per>70)
				System.out.println("Grade : B+");
			else if(per>60)
			    System.out.println("Grade : B");
			else if(per>50)
			    System.out.println("Grade : c");
		}
	}

}
