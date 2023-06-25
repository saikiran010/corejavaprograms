package strings;

public class CountLettersString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java is Object oriented Programming language";
		int countVowel=0,countCons=0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U' )
        	   countVowel++;
        	else if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
        		countVowel++;
        	else
        		countCons++;
        }
        System.out.println("The no. of Vowels :"+countVowel);
        System.out.println("The no. of Consonats :"+countCons);
	}

}
