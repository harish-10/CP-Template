package searching;

public class BinarySearch {

	public static int binarySearch(final int[] sortedNums, final int targetNum) {
		  int min = 0;
		  int max = sortedNums.length - 1;

		  if (targetNum < sortedNums[min] || targetNum > sortedNums[max]) {
		    return -1;
		  }
		  
		  while (min <= max) {
		    int mid = (max + min) / 2;

		    if (sortedNums[mid] == targetNum) { 
		      return mid;
		    } else if (sortedNums[mid] > targetNum) { // too high so we decrease the max
		      max = mid - 1;
		    } else { // too low so we increase the min
		      min = mid + 1;
		    }
		  }
		  return -1;
		 }
}
