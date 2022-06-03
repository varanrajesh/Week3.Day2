//$Id$
package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class FindSecondLargest 

{

	public static void main(String[] args)
	
	{
		Integer[] i = {3,2,11,4,6,7};
		// Converting Array to List
		List<Integer> list = Arrays.asList(i);
		// Converting list to Treeset for arranging items in ascending order
		TreeSet<Integer> tree_set = new TreeSet<Integer>(list);
		//For Verification
		System.out.println(tree_set);
		// Converting Treeset to list for getting the value via Index
		List<Integer> finalres = new ArrayList<Integer>(tree_set);
		System.out.println("The Second Largest number is " +(finalres.get((finalres.size()-2))));
		

	}

}
