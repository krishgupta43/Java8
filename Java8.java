package Java8;

import java.util.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {

	public static void main(String[] args) {
		String s = "ilovejavateche";
//		String[] arr = s.split("");
//		System.out.println(Arrays.toString(arr));
		// count the frequency of each characters;
		System.out.println("----Frequency of each characters using arrays stream----");
		System.out.println(Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		System.out.println();
		System.out.println(s.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
		System.out.println("-----------------------------------------------------------");
		
		String str="javatechies";
		IntStream stream=str.chars();  //instream represented the Ascii value of each char
		Stream<Character>charStream=stream.mapToObj(c->(char) c); //covert ascii to char 
		Map<Character,Long>mp_1=charStream.collect(Collectors.groupingBy(x->x,Collectors.counting()));
        System.out.println(mp_1);
		// find duplicate charachter in Strings
		System.out.println("----Duplicate elements: ----");
		Map<Object, Long> li = Arrays.stream(s.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()));
		System.out.println(li);
		List<Object> li_1 = li.entrySet().stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).collect(Collectors.toList());
		System.out.println(li_1);
		
		System.out.println(Arrays.stream(s.split("")).collect(Collectors.groupingBy(x->x,Collectors.counting()))
				.entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toList()));
		
		System.out.println("-----------------------------------------------------------");
				

		// find Unique elements
		System.out.println("----Unique elements----");
		List<String> ue = Arrays.stream(s.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).map(x -> x.getKey()).collect(Collectors.toList());
		System.out.println(ue);
		System.out.println("-----------------------------------------------------------");

		System.out.println("----Remove Duplicate elements----");
		List<Integer> remove_duplicate = Arrays.asList(10, 10, 12, 14, 12, 15, 19, 20);
		System.out.println(remove_duplicate.stream().distinct().collect(Collectors.toList()));
		System.out.println("-----------------------------------------------------------");
		
		
		System.out.println("----Sort Arrays assending order----");
		int[] numbers = { 10, 10, 12, 14, 12, 15, 19, 20 };
		List<Integer> res = Arrays.stream(numbers).boxed().sorted().collect(Collectors.toList());
		System.out.println(res);
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("----Sort Arrays Reverse order----");
		int[] numbers1 = { 10, 10, 12, 14, 12, 15, 19, 20 };
		List<Integer> res1 = Arrays.stream(numbers1).boxed().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(res1);

		System.out.println("-----------------------------------------------------------");
		List<Integer> li_2 = Arrays.asList(9, 10, 15, 18, 5);
		// new ArrayList<Integer>(Arrays.asList(9,10,15,18,5));
		li_2.stream().filter(i -> i > 9).forEach(x -> System.out.println(x));
		li_2.stream().map(i -> i * i).forEach(x -> System.out.println(x));

		int[] A = { 1, 2, 2, 3, 4, 5 };

		List<Integer> li_3 = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			li_3.add(A[i]);
		}
		// remove duplicates
		List<Integer>res_2=li_3.stream().distinct().collect(Collectors.toList());
		System.out.println(res_2);
		

		
//
//		List<Integer> primes = Arrays.asList(2, 3, 5, 7, 11);
//		IntSummaryStatistics stats = primes.stream().mapToInt(x -> x).summaryStatistics();
//		double res_1 = stats.getAverage();
//		System.out.println(res_1);
//
		//Map Interate
		HashMap<Integer, String> mp = new HashMap<>();
		mp.put(1, "Bajaj");
		mp.put(2, "Finser");
		mp.put(3, "Krishna");
		mp.put(4, "Gupta");
		mp.put(5, "Mayank");

		for (String s1 : mp.values()) {
			if (s1.startsWith("G"))
				System.out.println(s1);
		}
//
		System.out.println("--------------------------");
		System.out.println("itrate using stream API");
		mp.entrySet().stream().filter(x -> x.getValue().startsWith("K")).forEach(x -> System.out.println(x.getValue()));

		mp.entrySet().stream().forEach(x -> {
			if (x.getValue().startsWith("K")) {
				System.out.println(x.getKey() + "->" + x.getValue());
			}
		});
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        List<Integer>li_4=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		li_4.stream().filter(x->x*5>25).forEach(System.out::println);
//
	}
}
