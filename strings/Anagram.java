package strings;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String p="string",q="gsntir";
       if(p.length()==q.length())
       {
    	   for(int i=0;i<p.length();i++) {
           	int count=0;
            char temp=p.charAt(i);
           	for(int j=0;j<q.length();j++) {
           		if(temp==q.charAt(j))
           			count++;
           	}
           	if(count!=1) {
           		System.out.println("the strings are Not Anagram");
           		break;
           	}
           	if(i==p.length()-1)
           		System.out.println("the strings are Anagram");
           }
       }
       else
    	   System.out.println("the strings are not Anagram");
	}

}
