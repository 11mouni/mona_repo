package jSe;

import java.util.ArrayList;

public class conflict {

	public static void main(String[] args) {
//		int x =10;
//		int y= 20;
//		int sum = x+y;
//		System.out.println(sum);
//		System.out.println("sum of X and Y" +sum);
		
		 ArrayList<Integer> numbers = new ArrayList<>();

	        // Adding elements to the ArrayList
	        numbers.add(10);
	        numbers.add(20);
	        numbers.add(30);

	        // Accessing elements by index
	        System.out.println(numbers.get(1)); // Output: 20

	        // Modifying an element
	        numbers.set(2, 40);
	        System.out.println(numbers);

	        // Removing an element
	        numbers.remove(0);
	        System.out.println(numbers);
	        
	        // Iterating over the ArrayList
	        for (int number : numbers) {
	            System.out.println(number);

	            
	            
	            
	        }
						
	}

}
