package relationship;

public class Person {
   int id;
   String name;
   MyDate birthDate;
   public Person() {
	   id=101;
	   name="Saikiran";
	   birthDate=new MyDate();
   }
   public Person(int id,String name,MyDate birthDate) {
	   this.id=id;
	   this.name=name;
	   this.birthDate=birthDate;
   }
   public void display() {
	   System.out.println("Id "+id+" Name : "+name);
	   birthDate.display();
   }
}
