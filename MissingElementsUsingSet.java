//$Id$
package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class MissingElementsUsingSet 

{

	public static void main(String[] args) 
	
	{
		Integer[] numbers = {4,6,7,2,3,1,9,10,8,8,6,2};
		TreeSet<Integer>  numSet = new TreeSet<Integer>(Arrays.asList(numbers));
		System.out.println(numSet);
		
		List<Integer> missing = new ArrayList<Integer>(numSet);
		
		for(int i=0;i<numSet.size()-1;i++)
		{
			if(missing.get(i) != (i+1))
				
			{
				System.out.println("Missing Element is " +(i+1));
				break;
			}
			
		}
		

	}

}
