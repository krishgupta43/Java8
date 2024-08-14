package Practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDecendingOrder {
	
	public static void main(String[] args) {
//		List<Integer> li = new ArrayList<Integer>(Arrays.asList(9,10,15,18,5));
//		List<Integer> li_1 = new ArrayList<Integer>(Arrays.asList(9,10,15,18,5));
		List<Integer> li_2= Arrays.asList(9,10,15,18,5);
		
		System.out.println("-----------------------Print element using iterator---------------");
		Iterator i=li_2.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		
//		Comparator cmp=Collections.reverseOrder();
		Collections.sort(li_2,Collections.reverseOrder());
		
		li_2.stream().sorted(Comparator.reverseOrder());
		
		Iterator i2=li_2.iterator();
		while(i2.hasNext()) {
			System.out.print(i2.next()+" ");
		}
	}

}
