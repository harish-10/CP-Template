import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static searching.BinarySearch.binarySearch;
import static sorting.QuickSort.quickSort;
import static customFunctions.CustomFunctions.*;
import static stringAlgo.KMP.KMPSearch;
import static customMath.CustomMath.*;

public class JavaMain {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		Integer array[] = { 10, 40, 25, 57, 23, 96 };
		quickSort(array, 0, array.length - 1);

		printArray(array);

		binarySearch(array, 25);

		printArray(array);

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(40);
		list.add(25);
		list.add(57);
		list.add(23);
		list.add(96);

		quickSort(list, 0, list.size() - 1);

		printList(list);

		binarySearch(list, 25);

		printList(list);

		KMPSearch("aa", "aabbababaabba");
		
		System.out.println(gcd(10,15));
		System.out.println(lcm(10,75));
		System.out.println(power(2,18));
		primeFactors(257);
		System.out.println(toBinaryString(459));

		int t = Integer.parseInt(r.readLine());
		while (t > 0) {

			t--;
		}

	}

}
