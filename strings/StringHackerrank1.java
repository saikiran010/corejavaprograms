
package strings;
import java.io.*;
import java.util.*;

public class StringHackerrank1 {

    public static void main(String[] args) throws IOException{
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
       // Scanner sc=new Scanner(System.in);
        //String A=sc.next();
        //String B=sc.next();
        System.out.println("Enter strings :");
        String a=reader.readLine();
        String b=reader.readLine();
        System.out.println(a.length()+b.length());
        if(a.compareTo(b)<0)
            System.out.println("NO");
        else
        	System.out.println("YES");
        //a.toUpperCase(a.indexOf(0))
        String a1=a.substring(0,1 ).toUpperCase()+a.substring(1,a.length());
        String b1=b.substring(0,1 ).toUpperCase()+b.substring(1,a.length());
        System.out.println(a1+" "+b1);
        System.out.println("a".compareTo("a"));
        	
        	
        
    }
}
