package coding.practicals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaximumNumberInList {
	
	public static void main(String[] args) {
		
		
		List<Integer> listInt = Arrays.asList(1,4,7,45,23,545,345);
		Comparator<Integer> intComp =new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1>o2)
					return 1;
				else if(o1<o2) {
					return -1;
				}else {
					return 0;
				}
			}
		};
		
		
		Comparator<Integer> intComparator = (x,y)-> x.compareTo(y);
		int result = listInt.stream().max(intComparator).orElse(null);
		System.out.println(result);
		
		Integer result1 = listInt.stream().max(intComp).orElse(null);
		System.out.println(result1);
		
		
		Comparator<Integer> intCompar = (x,y)-> x<y ?-1:((x==y)?0:1);
		
		int result2= listInt.stream().max(intCompar).orElse(null);
		
		System.out.println(result2);
	}

}
