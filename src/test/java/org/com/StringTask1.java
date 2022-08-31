package org.com;

import java.util.HashMap;
import java.util.Map;

public class StringTask1 
{
	public static void main(String[] args)
	{
		String s = "apple orange mango banana";
		HashMap<Character, Integer> getMap = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++)
		{
			char chAt = s.charAt(i);
			if (getMap.containsKey(chAt))
			{
				Integer iG = getMap.get(chAt);
				getMap.put(chAt , iG+1);
				if(iG==1) 
				{
					System.out.println("Dublicate value in string  "+chAt);
				}
			}
				else {
					getMap.put(chAt, 1);
				}
			}
		for (Map.Entry entry : getMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		}
	}

