package org.com;

import java.util.HashMap;
import java.util.Map;

public class StringOcurance
{
	public static void characterCount(String s)
	{
		
		HashMap<Character, Integer> count =new HashMap<Character, Integer>();
		char[] a = s.toCharArray();
		for (char c : a) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c) + 1);
			}
			else {
				count.put(c, 1);
			}
		}
		for (Map.Entry entry : count.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}
	public static void main(String[] args)
	{
		String str = "Malayalam tamil";
		characterCount(str);
		
	}
}
