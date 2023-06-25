package exception;

public class favFruit {
	static void fruit(String fruitName) throws BadFoodException {
		if(fruitName.equalsIgnoreCase("Mango")) 
			System.out.println("I love "+fruitName);
		else
			throw new BadFoodException("I don't like "+fruitName);
	}

	public static void main(String[] args)  {
		try {
		fruit("mango");
		}catch(BadFoodException e){
			e.printStackTrace();
		}
		System.out.println("rest of code.......");
	

	}

}
