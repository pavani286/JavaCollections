package JavaCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();//virtual capacity of arraylist would 
		                                                 //be by default 10 in size 
		//phyiscal capcity of array list would be 0 before initalization and after
		// the capacity would increase...
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		System.out.println(a);
		//to increases the virtual capacity we can declare the size inside the arraylist object
		
		ArrayList<Object> b = new ArrayList<Object>(20);
		b.add(500);
		b.add("tom");
		b.add('t');
		b.add(true);
		
		System.out.println(b);
		
		ArrayList<String> s = new ArrayList<String>(Arrays.asList("Tom","Peter","Smith","Apple"));
		
		
		System.out.println(s);
	}

}
