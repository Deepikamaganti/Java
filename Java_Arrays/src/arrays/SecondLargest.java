package arrays;
import java.util.*;
public class SecondLargest {
	public static void  main(String[] args) {
		int[] arr= {23,34,33,77,12,98,78};
		Arrays.sort(arr);
		int n=arr.length;
		System.out.println(arr[n-2]);
	}

}
