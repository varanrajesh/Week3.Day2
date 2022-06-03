//$Id$
package week3.day2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates 

{
	public static void main(String[] args) 
	
	{
		Integer[] int1 = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer> duplicate = new HashSet<Integer>(Arrays.asList(int1));
		System.out.println("The list after removing Duplicates is " +duplicate);

	}

}
