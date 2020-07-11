import java.io.BufferedReader;
import java.io.InputStreamReader;

import static searching.BinarySearch.binarySearch;
import static sorting.QuickSort.quickSort;


public class JavaMain {

	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int array[] = { 10, 40, 25, 57, 23, 96 };
		quickSort(array,0,array.length-1);
		
		for( int i=0; i<array.length;i++)
			System.out.println(array[i]);

		binarySearch(array, 25);
		int t = Integer.parseInt(r.readLine());
		while (t > 0) {

			t--;
		}

	}

}
