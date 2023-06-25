package abstraction;

public class ShapeImp{
     public static void main(String args[]) {
    	 Rectangle r=new Rectangle(4,5);
    	 r.getArea();
    	 Shape c=new Circle(4);
    	 c.getArea();
    	 Shape t=new Triangle(5,2);
    	 t.getArea();
     }
}
