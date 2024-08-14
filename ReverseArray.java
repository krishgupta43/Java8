package Java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		ReverseArray_1(a);
	}

	private static void ReverseArray_1(int[] a) {
		IntStream.range(0, a.length/2).forEach(i->{
			int temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
		});
		
		System.out.println("Reserse array is : "+Arrays.toString(a));
		
	}

}
