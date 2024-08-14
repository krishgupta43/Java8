package Java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleusingJava8 {
	
	public static void main(String[] args) {
		String str="iliovejavatechi";
		
		//find the frequency of each character
		IntStream stream=str.chars();  //covert string into char instrweam return ascii value of char 
		Stream<Character>charStreamstream=stream.mapToObj(c->(char)c); //convert ascii to char 
		Map<Character,Long>mp=
		charStreamstream.collect(Collectors.groupingBy(x->x,Collectors.counting()));
		System.out.println(mp);
		
		
		
		//find min and max using java 8
		
		List<Integer>numbers=Arrays.asList(30,21,14,10,5);
		int res=numbers.stream().min(Comparator.naturalOrder()).get();
	   System.out.println(res);
	   int res_1=numbers.stream().max(Comparator.naturalOrder()).get();
	   System.out.println(res_1);
	   
	   //second largest number
	   System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
	}
	

}
