package coreJava.collection.topics;

import java.util.HashSet;
import java.util.LinkedHashSet;

import customer.model.Developer;

public class SetImplementationFeatures {

	public static void main(String[] args) {

		// Primitive with HashSet & LinkedHashSet classes
		System.out.println("\n");
		System.out.println("HashSet with Primitive DataType--> Integer");
		HashSet<Integer> integerHashset = new HashSet<>();
		integerHashset.add(1);
		integerHashset.add(12);
		integerHashset.add(14);
		integerHashset.add(15);
		integerHashset.add(16);
		integerHashset.add(12);
		integerHashset.add(1);
//		Duplicates are not allowed and order will not be maintained
		for (Integer integer : integerHashset) {
			System.out.println(integer);
		}
		System.out.println("\n");
		System.out.println("LinkedHashSet with Primitive DataType--> Integer");
		// We will use to maintain the insertion Order in Set impl. class, we can use
		// LinkedHashSet
		LinkedHashSet<Integer> linedkedHashset = new LinkedHashSet<>();
		linedkedHashset.add(1);
		linedkedHashset.add(12);
		linedkedHashset.add(14);
		linedkedHashset.add(15);
		linedkedHashset.add(16);
		linedkedHashset.add(12);
		linedkedHashset.add(1);

		for (Integer integer : linedkedHashset) {
			System.out.println(integer);
		}
		System.out.println("\n");
		System.out.println("HashSet with Customer Model Object --> Developer");
		/*
		 * With Customer Model Classes *, to maintain the order of objects  we can use LinkedHashSet 
		 */
		HashSet<Developer> developer_Hashset = new HashSet<>();
			Developer dev1 = new Developer(123, "Praneeth", "India");
			Developer dev2 = new Developer(124, "Chakravarthi", "Germany");
			Developer dev3 = new Developer(125, "Diguvapalem", "USA");
			Developer dev4 = new Developer(126, "Prajnasri", "Germany");
			Developer dev5 = new Developer(123, "Praneeth", "India");

			developer_Hashset.add(dev1);
			developer_Hashset.add(dev2);
			developer_Hashset.add(dev3);
			developer_Hashset.add(dev4);
			developer_Hashset.add(dev5);

		for (Developer developer : developer_Hashset) {
			System.out.println(developer);
		}

		System.out.println(dev1.equals(dev5));
		System.out.println(dev1.hashCode());
		System.out.println(dev5.hashCode());
	}

}
