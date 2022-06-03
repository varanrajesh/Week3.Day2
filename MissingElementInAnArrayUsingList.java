//$Id$
package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArrayUsingList 

{

	public static void main(String[] args)
	
	{
		Integer[] num = {1,2,3,4,7,6,8};
		List<Integer>  num1 = Arrays.asList(num);
		Collections.sort(num1);
		System.out.println(num1);
		for(int i=0;i<num1.size();i++)
		{
			if( num1.get(i) != (i+1) )
				
			{
				System.out.println("Missing Elements :" +(i+1));
				break;
			}
					
				
		 	
		}

	}

}
