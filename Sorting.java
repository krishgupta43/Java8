package Practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
	
	public static void main(String[] args) {
		String [] names = {"Sovit Jain", "Manish Jain", "Abhishek Kothari"};
		Arrays.sort(names);
		for(String name:names){
			System.out.println(name+" ");
		}
		
		List<String>li=Arrays.asList("bottom","apple","dog","cat");
		li.stream().sorted(Comparator.comparing(null, null));
		Collections.sort(li,(s1,s2)->Integer.compare(s1.length(), s2.length()));
		li.forEach(System.out::print);
		
	}

}
 