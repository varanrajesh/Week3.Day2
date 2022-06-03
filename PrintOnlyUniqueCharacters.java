//$Id$
package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintOnlyUniqueCharacters 

{

	public static void main(String[] args) 
	
	{
		String input = "babu";
		char ch[] = input.toCharArray();
		Set<Character> printUnique = new HashSet<Character>();
		System.out.println(printUnique);
		for (int i = 0; i<ch.length; i++)
			if (!printUnique.add(ch[i]))
				printUnique.remove(ch[i]);

		System.out.println("Unique values in the string are: " + printUnique);

	}

}
