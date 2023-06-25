package abstraction;

public interface Shape {
	void getArea();
}
class Rectangle implements Shape{
	double length,breadth;
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	 @Override
	   public void getArea() {
		 System.out.println("The area of Rectangle is  "+length*breadth);
	   }
}
class Circle implements Shape{
	float a;
	public Circle(float a) {
		this.a=a;
	}
	   @Override
	   public void getArea() {
		   System.out.println("The area of Circle is  "+3.14f*a*a);
	   }
	}
class Triangle implements Shape{
	double height,base;
	  public Triangle(double height,double base) {
		  this.height=height;
		  this.base=base;
	  }
 @Override
 public void getArea() {
	   System.out.println("The area of Triangle is  "+0.5*height*base);
 }
	  
}
