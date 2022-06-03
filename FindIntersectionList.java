//$Id$
package week3.day2;

import java.util.Arrays;
import java.util.List;

public class FindIntersectionList 

{

	public static void main(String[] args)

	{
		Integer arr1[] = {3,2,11,4,6,7};
		Integer arr2[] = {1,2,8,4,9,7};

		List<Integer> l1 = Arrays.asList(arr1);
		List<Integer> l2 = Arrays.asList(arr2);

		for(int i=0;i<l1.size();i++)
			for(int j=0;j<l2.size();j++)
			{
				if(l1.get(i)==l2.get(j))
				{
					System.out.println("The common Intersection between the Arrays is: " +l1.get(i));
				}

			}





	}

}
