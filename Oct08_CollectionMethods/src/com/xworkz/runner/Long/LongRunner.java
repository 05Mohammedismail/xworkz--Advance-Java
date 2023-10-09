package com.xworkz.runner.Long;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class LongRunner {
	

		static Collection<Long> longOne = new ArrayList<>();
		static Collection<Long> longTwo = new ArrayList<>();

		public static void main(String[] args) {
			System.out.println("add - to longOne");
			longOne.add(1l);
			longOne.add(22l);
			longOne.add(333l);
			longOne.add(4444l);
			longOne.add(55555l);

			System.out.println(longOne + "\n");

			System.out.println("addAll - to longTwo from longOne");

			longTwo.addAll(longOne);
			System.out.println(longTwo + "\n");

			System.out.println("remove - from longTwo");
			longTwo.remove(333l);
			System.out.println(longTwo + "\n");

			System.out.println("size - of longTwo");
			System.out.println(longTwo.size() + "\n");

			System.out.println("retainAll(modify) - longOne as longTwo");
			System.out.println(longOne);
			longOne.retainAll(longTwo);
			System.out.println(longOne + "\n");

			System.out.println("contains - in longOne");
			boolean check1 = longOne.contains(22l);
			if (check1) {
				System.out.println("Yes it contains \n");
			} else {
				System.err.println("No it doesn't contains \n");
			}

			System.out.println("containsAll - longTwo contains All as longOne");
			boolean check2 = longTwo.containsAll(longOne);
			if (check2) {
				System.out.println("Yes it contains \n");
			} else {
				System.err.println("No it doesn't contains \n");
			}

			System.out.println("iterator - for longOne");
			Iterator<Long> it = longOne.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
				System.out.println();
			
			System.out.println("removeAll - from longTwo");
			longTwo.removeAll(longTwo);
			System.out.println("Size after removeAll is " + longTwo.size() + "\n");
		
			System.out.println("isEmpty - for longTwo");
			boolean check3 = longTwo.isEmpty();
			if(check3) {
				System.out.println("Yes its empty \n");
			}
			else {
				System.out.println("No its not empty \n");
			}
			
			System.out.println("toArray - from longOne");
			Object[] arr = longOne.toArray();
			System.out.println("Array from longOne is " + Arrays.toString(arr));
		}
		

	}


