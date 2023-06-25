package arrays;
import java.util.Scanner;
public class MarksDescendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rollNo[]=new int[5];
        int marks[]=new int[5];
        System.out.println("Enter 5 students rollnumbers :"); 
        for(int i=0;i<5;i++)
        	rollNo[i]=sc.nextInt();
        System.out.println("Enter 5 students Marks :"); 
        for(int i=0;i<5;i++)
        	marks[i]=sc.nextInt();
        for(int i=0;i<5;i++) {
        	for(int j=i+1;j<5;j++) {
        		if(marks[i]<marks[j]) {
        			int temp1=marks[i];
        			marks[i]=marks[j];
        			marks[j]=temp1;
        			int temp2=rollNo[i];
        			rollNo[i]=rollNo[j];
        			rollNo[j]=temp2;
        		}
        	}
        }
        System.out.println("Order of Student roll Numbers with highest marks :"); 
        for(int i=0;i<5;i++)
        	System.out.print(rollNo[i]+"\t"+marks[i]+"\n");
	}
}
