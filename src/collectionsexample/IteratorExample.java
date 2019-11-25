package collectionsexample;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample {
	
	public static void main(String[] args) {
		Collection<String> collection = Arrays.asList("red", "orange", "yellow", "green", "blue", "indigo", "violet");
		Iterator<String> iterator = collection.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
