package Methods;

public class Student {
   int rollNo;    //variable declaration
   String name;   //instance variable:which is declared inside class
   float phy,chem,math,tot,percent;
   
   public Student() {
	   //default:without any parameter.used to initiate default values
	   rollNo=101;
	   name="sai";
	   phy=67;
	   chem=87;
	   math=74;
   }
  /* 	public Student(int rno,String nm,float p,float c,float m) { 
   	  rollNo=rno;
   	  name=nm;
   	  phy=p;
   	  chem=c;
   	  math=m;
   	
   }*/
   	public Student(int rollNo,String name,float phy,float chem,float math) {
   		this.rollNo=rollNo;
   		this.name=name;
   		this.phy=phy;
   		this.chem=chem;
   		this.math=math;
   	}
   	public void calculate() {
   		tot=phy+chem+math;
   		percent=tot/3;
   		System.out.println("------Student Info------");
   		System.out.println("Roll Number : "+rollNo);
   		System.out.println("Name: "+name);
   		System.out.println("Total : "+tot);
   		System.out.println("Percent : "+percent);
   	}
}
