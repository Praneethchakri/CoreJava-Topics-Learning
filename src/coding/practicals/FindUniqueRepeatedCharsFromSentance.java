package coding.practicals;

import java.util.Map;
import java.util.stream.Collectors;

public class FindUniqueRepeatedCharsFromSentance {
	
	public static void main(String[] args) {
		
	String str ="Here we go again, With a lot of hopes to achieve success";	
		System.out.println(repeateCharsFromString(str));	
	}

	private static String repeateCharsFromString(String str) {
		
		return str.toLowerCase().chars().filter(c -> c != ' ')
				.mapToObj(c-> (char)c)
				.collect(Collectors.groupingBy( c->c, Collectors.counting()))
				.entrySet().stream()
				.filter(entry ->entry.getValue() > 1)
				.map(Map.Entry::getKey)
				.sorted() //a, c, e, g, h, i, o, s, t, w
				.map(String::valueOf)
				.collect(Collectors.joining(", "));
//								.forEach(t->System.out.println(t));
				
		
		
		
	}
	
	

}
