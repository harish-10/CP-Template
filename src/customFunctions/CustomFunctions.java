package customFunctions;

import java.util.List;

public class CustomFunctions {

	public static <T> void printArray(T[] array) {
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}

	public static <T> void printList(List<T> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
