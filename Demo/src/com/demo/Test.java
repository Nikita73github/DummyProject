package com.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {



			public static void main(String[] args) {
		    
			ArrayList<String> list = new ArrayList<String>();
			list.add("sima");
			list.add("pooja");
			list.add("nima");
			list.add("kiran");
			 
			Iterator<String> itr = list.iterator();
			while(itr.hasNext()) {
			System.out.println(itr.next());
			}

			}

		}


	


