package com.itrainu.CollectionProgram.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet s = new LinkedHashSet();
		s.add("zero");
		s.add("one");
		s.add("two");
		s.add("three");
		s.add("four");
		s.add("five");
		Iterator it = s.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}

}
