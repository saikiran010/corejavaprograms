package abstraction;

public class InterfaceImp implements Drawable, Printable {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
       float radius=10;
       float area=PI*radius*radius;
       System.out.println("Area of Circle : "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        InterfaceImp interfaceImp=new InterfaceImp();
        interfaceImp.calculate();
        interfaceImp.cube(5);
        System.out.println("Square : "+Drawable.square(5));
	}
	@Override
	public void print() {
	   System.out.println("implementing multiple inheritance .......... method from 2nd interface");

	}

}
