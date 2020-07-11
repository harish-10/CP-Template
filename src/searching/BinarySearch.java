package searching;

import java.util.List;

public class BinarySearch {

	public static int binarySearch(final Integer[] sortedNums, final int targetNum) {
		int min = 0;
		int max = sortedNums.length - 1;

		if (targetNum < sortedNums[min] || targetNum > sortedNums[max]) {
			return -1;
		}

		while (min <= max) {
			int mid = (max + min) / 2;

			if (sortedNums[mid] == targetNum) {
				return mid;
			} else if (sortedNums[mid] > targetNum) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		return -1;
	}

	public static int binarySearch(final List<Integer> sortedNums, final int targetNum) {
		int min = 0;
		int max = sortedNums.size() - 1;

		if (targetNum < sortedNums.get(min) || targetNum > sortedNums.get(max)) {
			return -1;
		}

		while (min <= max) {
			int mid = (max + min) / 2;

			if (sortedNums.get(mid) == targetNum) {
				return mid;
			} else if (sortedNums.get(mid) > targetNum) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}
		}
		return -1;
	}
}
