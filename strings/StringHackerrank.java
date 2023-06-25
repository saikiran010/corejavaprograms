package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StringHackerrank{
	public void typeCount(String s) {
		String str[]=s.split(" ");
		for(String obj:str)
			System.out.println(obj);
		int dd=0,ii=0,ss=0;
		for(int i=0;i<str.length;i++) {
			boolean iflag=true,dflag=true;
			try {
				int d=Integer.parseInt(str[i]);
			}catch(NumberFormatException e) {
				iflag=false;
			}
			if(iflag==false) {
				try {
					double g=Double.parseDouble(str[i]);
				}catch(NumberFormatException e) {
					dflag=false;
				}
			}
			if(iflag==false && dflag==false)
				ss=ss+1;
			if(iflag==true)
				ii=ii+1;
			if(dflag==true)
				dd=dd+1;
		}
		System.out.println("string "+ss);
		System.out.println("int "+ii);
		System.out.println("double "+dd);
	}
	
	public static void main(String args[]) throws IOException {
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence :");
		String s=read.readLine();
		StringHackerrank s1=new StringHackerrank();
		s1.typeCount(s);
	}
}