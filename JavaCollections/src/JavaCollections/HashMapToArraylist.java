package JavaCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapToArraylist {

	public static void main(String[] args) {
		
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("tom", 1);
		m.put("peter", 2);
		m.put("steve", 3);
		m.put("smith", 4);
		m.put("peter", 5);
		
		Set<String> s = new HashSet<String>(m.keySet());
		for(int i=0;i<s.size();i++) {
			System.out.println(s);
		}
		System.out.println("*******using entryset() for key-value pairs **************");
		
		Iterator<Entry<String,Integer>> set = m.entrySet().iterator();
		while(set.hasNext()) {
			Entry<String,Integer> pairs = set.next();
		 System.out.println("key = "+pairs.getKey()+ " value = " +pairs.getValue());
		}
		System.out.println("*********using keyset() for extracting  keys only ***************");
		List<String> l = new ArrayList<String>(m.keySet());
		for(String s1 : l) {
			System.out.println(s1);
		}
		System.out.println("******using values() for extracting values only ******************");
		List<Integer> l1 = new ArrayList<Integer>(m.values());
		for(int s1 : l1) {
			System.out.println(s1);
		}
		
	}

}
