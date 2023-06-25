package exception;

import java.io.BufferedReader;    //import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsExample {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		int age;
		String name;
		float m1,m2;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Name :");
		name=reader.readLine();
		System.out.println("Enter age :");
		age=Integer.parseInt(reader.readLine());
		System.out.println("Enter marks of 2 subjects :");
		m1=Float.parseFloat(reader.readLine());
		m2=Float.parseFloat(reader.readLine());
		  
		float avg=(m1+m2)/2;
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		System.out.println("Average :"+avg);
   }

}
