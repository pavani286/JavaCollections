package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		// how to make arraylist threadsafe/synchronized
        //1. collections.synchronizedlist() -- method --returns synchronized list
		
		System.out.println("****** Synchronized ArrayList Using collections.synchronizedlist() ******");
		
		List<String> arr = Collections.synchronizedList
				(new ArrayList<String>(Arrays.asList("Tom","Peter","Smith","Apple","Apple")));
		
		Iterator<String> it = arr.iterator();
		   while(it.hasNext()) {
			  System.out.println(it.next());
		}
		
		//2.copyonwriteArrayList --- class -- Threadsafe variant of ArrayList
	    System.out.println("******* Synchronized ArrayList Using copyonwriteArrayList  ********");
	
		CopyOnWriteArrayList<String> emplist = new CopyOnWriteArrayList<String>();
		emplist.add("tom");
		emplist.add("peter");
		emplist.add("david");
		emplist.add("smith");
		
		Iterator<String> it1 = emplist.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}

}
