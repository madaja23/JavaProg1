package ListOfNumbers;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class AddingNum {
	 public static void removeDuplicates(int[] arr) {
	        LinkedHashSet<Integer> set
	                = new LinkedHashSet<Integer>();
	        
	        
	        // adding elements to LinkedHashSet so we can remove duplicates
	        for (int i = 0; i < arr.length; i++)
	            set.add(arr[i]);
	        
	        
	        // Print the elements of LinkedHashSet
	        System.out.println(set);
	        
	        
	        //Converting set to a list
	        List<Integer> duplicatesRemovedList = new ArrayList<>(set);
	        

	        //sorting in descending order
	        List<Integer> sortedList = duplicatesRemovedList.stream().sorted((s1,s2)->s2.compareTo((s1))).collect(Collectors.toList());
	        

	        //Printing out the sorted List
	        sortedList.forEach(System.out::println);
	        
	        
	    }
	    

	    // Driver code


	public static void main(String[] args) {
		

		// list of 10 numbers ranging between 1 to 100 with 4 duplicates in the list of numbers
		        int arr[] = {1, 2, 80, 1, 7, 2, 4, 80, 50, 7};

		        // Function call
		        removeDuplicates(arr);
		    }
		}



	


