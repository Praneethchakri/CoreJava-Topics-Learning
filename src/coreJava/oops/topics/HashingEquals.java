package coreJava.oops.topics;

public class HashingEquals {
	
	public static void main(String[] args) {
		
		int x =10;
		int y=10;
		System.out.println("X & Y Equal  "+ Boolean.valueOf(x==y));
		
		String s1 = new String("Praneeth");
		
		String s2 = new String("Praneeth");
		
		
//		== method will be used to compare the  value of primitives.
//		and if we use == to compare objects it will point to underlying memory allocation of object
//		even above both objects have the same value , underlying memory allocation in java will be different which will return false.
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2); 
		System.out.println(s1.equals(s2));
		
		String name= "Praneeth";
		String name1 = "Praneeth";
		
		System.out.println(name.equals(name1));

	
	
	}

}
