package com.itrainu.CollectionProgram.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map m= new HashMap();
		
		m.put(1, null);
		m.put(2, null);
		m.put(3,"karan ");
		m.put(4, "shivam");
		
		System.out.println(m.size());
		System.out.println(m);
		System.out.println(m.get(4));
		

	}

}
