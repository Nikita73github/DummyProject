package com.demo;

import java.util.HashMap;
import java.util.Iterator;

public class Example {

    public HashMap<Integer, String> m1() {
	
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(101, "nikita");
	map.put(102, "shilpa");
	map.put(103, "ashish");
	map.put(104, "jagjit");
	
	return map;
  }	
	public static void main(String[] args) {
		
		Example example = new Example();
		HashMap<Integer, String> obj = example.m1();
		
		System.out.println(obj);
	

}
}