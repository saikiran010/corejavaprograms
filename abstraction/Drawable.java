package abstraction;

public interface Drawable {
	
    float PI=3.14f;     //public static final
    
    void calculate();  //public abstract
    
    static int square(int a) {
    	return a*a;
    }
    
    default void cube(int a) {
    	System.out.println("Cube :"+(a*a*a));
    }
}
