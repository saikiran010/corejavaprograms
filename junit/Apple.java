package junit;

public class Apple {

	String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	boolean checkColor() {
		if(color.equalsIgnoreCase("green") || color.equals("red"))
		     return true;
		else
			return false;
	}
}
