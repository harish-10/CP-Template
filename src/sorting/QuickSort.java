package sorting;

import java.util.List;

public class QuickSort {
	public static void quickSort(Integer[] arr, int low, int high) {

		if (arr == null || arr.length == 0) {
			return;
		}

		if (low >= high) {
			return;
		}

		int middle = low + (high - low) / 2;
		int pivot = arr[middle];

		int i = low, j = high;
		while (i <= j) {

			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}

		if (low < j) {
			quickSort(arr, low, j);
		}
		if (high > i) {
			quickSort(arr, i, high);
		}
	}

	public static void quickSort(List<Integer> arr, int low, int high) {

		if (arr == null || arr.size() == 0) {
			return;
		}

		if (low >= high) {
			return;
		}

		int middle = low + (high - low) / 2;
		int pivot = arr.get(middle);

		int i = low, j = high;
		while (i <= j) {

			while (arr.get(i) < pivot) {
				i++;
			}

			while (arr.get(j) > pivot) {
				j--;
			}

			if (i <= j) {
				swap(arr, i, j);
				i++;
				j--;
			}
		}

		if (low < j) {
			quickSort(arr, low, j);
		}
		if (high > i) {
			quickSort(arr, i, high);
		}
	}

	public static void swap(Integer array[], int x, int y) {
		int temp = array[x];
		array[x] = array[y];
		array[y] = temp;
	}

	public static void swap(List<Integer> array, int x, int y) {
		int temp = array.get(x);
		array.add(x, array.get(y));
		array.add(y, temp);
	}
}
