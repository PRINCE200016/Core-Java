
package com.itrainu.CollectionProgram.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hashSet {

	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add(200);
		s.add(100);
		s.add(300);
		s.add(400);
		System.out.println(" the result of this code:");

		Iterator it = s.iterator();

		while (it.hasNext()) {
			int num = (int) it.next();

			System.out.println(num);
			// Set syncSet = Collections.synchronizedSet(s);

		}

	}

}
