package map;

import java.util.LinkedHashMap;
import java.util.Map;

public final class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String company="Cognizant";
		company=company.toLowerCase();
		System.out.println(company);
		char[] charArray = company.toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		for(char eachChar:charArray )
		{
			System.out.println(eachChar);
			if(map.containsKey(eachChar))
			{
				map.put(eachChar,map.get(eachChar)+1);
				//System.out.println(map);
				
			}
			else
			{
				map.put(eachChar, 1);
				
			}
			
			
			
		}
		// if(map.values()>1)
		System.out.println(map);
	}
	

}
