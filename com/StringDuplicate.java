package org.com;

import java.util.ArrayList;
import java.util.List;

public class StringDuplicate 
{
	public static void main(String[] args)
	{
		List<String> s = new ArrayList<String>();
		s.add("Automation Testing");
		List <String> a = new ArrayList<String>();
		a.addAll(s);
		a.add("java");
		System.out.println(a);
		s.retainAll(a);
		System.out.println(s);
		a.removeAll(s);
		System.out.println(a);
	}
}
