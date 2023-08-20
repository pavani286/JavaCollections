package JavaCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
	
		Set<Integer> i = new HashSet<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
		
	
		Set<Integer> i1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		System.out.println("***** get the union or adding the elements **********");
		
		Set<Integer> union = new HashSet<Integer>(i);
		union.addAll(i1);
	    System.out.println(union);
		
		System.out.println("********  get the intersection or common element's would be displayed ********************");
		
		Set<Integer> intersection = new HashSet<Integer>(i1);
		intersection.retainAll(i);
		System.out.println(intersection);
		
        System.out.println("******** get the differences or Removing the duplicate elements or extra values *************");
		
		Set<Integer> differences = new HashSet<Integer>(i1);
		differences.removeAll(i);
		System.out.println(differences);

	}

}
