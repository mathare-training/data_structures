package collectionsexample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
		System.out.println("Position of the number 21: " + Collections.binarySearch(list1, 21));
	}

}
