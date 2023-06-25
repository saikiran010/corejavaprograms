package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		
     List<String> list=Arrays.asList("Raj","BhagyaShree","Ravalika","Reema","Venkatesh","paras","Soloni");
     
     //Creating Stream
     
     Stream<String> allNames=list.stream();
     
     //Perform Intermediate Operation : length>7 
     
     Stream<String> longNames=allNames.filter(str->str.length()>7);
     
     System.out.println("Long names (>7 length) :");
     //perform terminal operation : print long names
     longNames.forEach(str -> System.out.println(str));
     
     System.out.println("Long names (>7 and <9 length) :");
     
     list.stream().filter(str->str.length()>7 && str.length()<9).forEach(str -> System.out.println(str));

	}

}
