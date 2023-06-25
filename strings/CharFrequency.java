package strings;

public class CharFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="Saikiran";
        char temp;
        
        for(int i=0;i<s.length();i++) {
        	int count=0;
        	temp=s.charAt(i);
        	for(int j=0;j<s.length();j++) {
        		if(temp==s.charAt(j))
        			count++;
        	}
        	System.out.println(temp+" frequency is "+count);
        }
	}

}
