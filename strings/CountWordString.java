package strings;

public class CountWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is Object oriented Programming language";
		int count=0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ')
        	   count++;
        }
        System.out.println("The no. of words : "+(count+1));
	}

}
