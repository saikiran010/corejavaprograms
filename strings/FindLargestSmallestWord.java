package strings;

public class FindLargestSmallestWord {

	public static void main(String[] args) {
		String s="Java is Object oriented wwwwwwwwwwwwwwwwwww Programming language";
		String large=s.substring(0),small=s.substring(0),temp1;
		int temp=0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)==' ') {
        		large=s.substring(0,i);
        		small=s.substring(0,i);
        		temp=i;
        		break;
        	}
        }
        for(int i=temp+1;i<s.length();i++) {
        	if(s.charAt(i)==' ') {
        		temp1=s.substring(temp,i);
        		if(temp1.length()>large.length()) {
        			large=temp1;
        		}
        		if(temp1.length()<small.length()) {
        			small=temp1;
        		}
        		temp=i;
        	}
        }
        System.out.println("The largest word :"+large);
        System.out.println("The smallest word :"+small);
	}
}
