package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemovingDuplicateElements {

	public static void main(String[] args) {
		//Removing Duplicate Elements in a ArrayList
		//1.linkedhashset
		//2.jdk8 streams
		
		//1.linkedhashset
		ArrayList<String> s = new ArrayList<String>((Arrays.asList("Tom","Tom","Peter","Apple","Smith","Apple")));
		
		LinkedHashSet<String> linkedhashset = new LinkedHashSet<String>(s);
        
		ArrayList<String> listwithoutduplicates = new ArrayList<String>(linkedhashset);
		System.out.println(listwithoutduplicates);
		
		//2.java8 sterams
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(
				Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10));
		
		List<Integer> numberewithoutduplicates = 
				numbers.stream().distinct().collect(Collectors.toList());
		
		System.out.println(numberewithoutduplicates);
	}

}
