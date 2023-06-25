package strings;

public class RemoveCharfromString {

	public static void main(String[] args) {
		 
    String s="Saikiran";
    for(int i=0;i<s.length();i++) {
		if(i==2) {
			System.out.print(" ");
			continue;
		}
		else 
			System.out.print(s.charAt(i));
	}
	}
	}


