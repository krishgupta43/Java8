package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements {
	public static void main(String[] args) {
		int a[]= {1,2,4,3,5};
		int b[]= {3,4,5,10,9};
		
		fetchCommonElement(a,b);
	}

	private static void fetchCommonElement(int[] arr1, int[] arr2) {
		
		List<Integer>res=Arrays.stream(arr1).filter(numberArr1->Arrays.stream(arr2).anyMatch(numberArr2->numberArr2==numberArr1))
				.boxed().collect(Collectors.toList());
		System.out.println(res);
		
	}

}
