package grid;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUnique {

	
	public static void main(String[] args) {
		 String comp="google";
		// Set<Character> uniquechar=new HashSet<Character>();
		 List <Character> list=new ArrayList<Character>();
		char[]  charArray= comp.toCharArray();
		for(char c:charArray)
		{
			
			if(!list.contains(c))
			{
				list.add(c);
			}
			//uniquechar.add(c);
		}
		
		System.out.println(list);
	}
	
	
}
