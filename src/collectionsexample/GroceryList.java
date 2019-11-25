package collectionsexample;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {

    public static void main(String[] args) {
    	
    	ArrayList<String> groceries = new ArrayList<>();
    	groceries.add("Eggs");
    	groceries.add("Bread");
    	groceries.add("Milk");
    	groceries.add("Coffee");
    	System.out.println("Groceries: " + groceries);
    	
    	ArrayList<String> extras = new ArrayList<>(Arrays.asList("Pizza", "Butter", "Tea"));
    	System.out.println("Extra items: " + extras);
    	
    	groceries.addAll(extras);
    	System.out.println("Combined list: " + groceries);
    	
    	System.out.println("Coffee can be found at position: " + groceries.indexOf("Coffee"));
    	
    	groceries.remove(4);
    	groceries.remove("Bread");
    	System.out.println("Updated groceries list: " + groceries);
    	

    }
    
}
