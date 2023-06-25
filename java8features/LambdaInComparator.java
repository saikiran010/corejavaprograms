package java8features;
import java.util.ArrayList;
class Product{
	int id;
	String prodName;
	float price;
	public Product(int id, String prodName, float price) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", price=" + price + "]";
	}
	
}

public class LambdaInComparator {

	public static void main(String[] args) {
		
		ArrayList<Product> list=new ArrayList<Product>();
		
		list.add(new Product(101,"Keyboard",3000));
		list.add(new Product(102,"Monitor",32000));
		list.add(new Product(103,"Mousepad",1000));
		list.add(new Product(104,"Speakers",12000));
		list.add(new Product(105,"Cpu",41000));
		list.add(new Product(106,"Laptop",70000));

	}

}
