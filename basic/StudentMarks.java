package basic;
import java.util.Scanner;
public class StudentMarks {
  public static void main(String args[]) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter 3 subjects marks");
	  int m1=sc.nextInt();
	  int m2=sc.nextInt();
	  int m3=sc.nextInt();
	  int tot=m1+m2+m3;
	  System.out.println("total marks : "+tot);
	  System.out.printf("The percentage is : %f ",((tot/300.0)*100));
	  
  }
}
