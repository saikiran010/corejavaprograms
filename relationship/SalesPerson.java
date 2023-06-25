package relationship;

public class SalesPerson extends Employee{
     double sale;
     double commision;
     public SalesPerson() {
    	super();
        sale=0.9;
        commision=0;
     }
     public SalesPerson(int  id,String name,MyDate birthDate,double workingDays,double perDay,double sale) {
    	 super(id,name,birthDate,workingDays,perDay);
    	 this.sale=sale;
     }
     public void calculate() {
    	 super.calculate();
    	 if(sale>=0.95)
    		 commision=0.2*salary;
    	 else if(sale>=0.90)
    		 commision=0.15*salary;
    	 else if(sale>=0.80)
    		 commision=0.1*salary;
    	 else if(sale>=0.75)
    		 commision=0.05*salary;
    	 else
    		 commision=0;
     }
     public void display() {
    	 super.display();
    	 System.out.println("Commision :"+commision);
    	 System.out.println("Total salary :"+(salary+commision));
     }
}
