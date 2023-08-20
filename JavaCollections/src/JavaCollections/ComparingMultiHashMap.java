package JavaCollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ComparingMultiHashMap {

	public static void main(String[] args) {
		
		// We can compare the multiple HashMap  using 
		//1. key and values with equals() method 
		//2. for only same no of keys using keyset() method
		//3. for only values in HashMap using values() method
		//4. Finding extra keys in HashMap using HashSet
		
		HashMap<Integer,String>  map = new HashMap<Integer,String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(null, "D");
		
		HashMap<Integer,String>  map1 = new HashMap<Integer,String>();
		map1.put(3, "C");
		map1.put(2, "B");
		map1.put(1, "A");
		
		HashMap<Integer,String>  map2 = new HashMap<Integer,String>();
		
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");
		map2.put(3, "D");
		System.out.println("********  comparing multiple hashmap keys and values using equals() method  *************");
		//1. comparing multiple hashmap keys and values pairs using equals() method 
		System.out.println(map.equals(map1));
		System.out.println(map.equals(map2));
		
		System.out.println("*********compare hashmaps for the same keys : keyset() method  ************");
		//2. compare hashmaps for the same keys : keyset() method
		
		System.out.println(map.keySet().equals(map1.keySet()));
		System.out.println(map1.keySet().equals(map2.keySet()));
		
		System.out.println("******** how to find out the extra keys in hashmap *************");
		//3. how to find out the extra keys in hashmap ?
      
		HashMap<Integer,String>  map3 = new HashMap<Integer,String>();
		
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "D");
		
		//combine all (map,map3) the keys using hashset
		
		HashSet<Integer> combinekeys = new HashSet<>(map.keySet());
		// add map keys to combinekeys and than add map4 keys to combinekeys
		//using addAll() method
		combinekeys.addAll(map3.keySet());
		// remove map keys from combinekeys using removeall() method
		combinekeys.removeAll(map.keySet());
		//print combine keys an finally we get extra key from hash map
		System.out.println(combinekeys);
		
		//4. comparing hashmap with values 
		
		HashMap<Integer,String>  map4 = new HashMap<Integer,String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		
		HashMap<Integer,String>  map5 = new HashMap<Integer,String>();
		map5.put(4, "A");
		map5.put(5, "B");
		map5.put(6, "C");
		
		HashMap<Integer,String>  map6 = new HashMap<Integer,String>();
		
		map6.put(7, "A");
		map6.put(8, "B");
		map6.put(9, "C");
		map6.put(10, "C");
		System.out.println("*******  comparing the hashmap with values() method   ********");
		
		System.out.println("******* comparing the values using Arrylist ********");
		// comparing the values using Arrylist 
		//Arraylist allows duplicate values and ordering index
		
		System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map5.values())));
		System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map6.values())));
		
		
		System.out.println("**********  comparing the values using hashset  ***************");
		// comparing the values using hashset allows duplicates  but at runtime 
		// it removes all duplicates and make it true where as arraylist doesn't
		//remove duplicate and it makes it false
		System.out.println(new HashSet<>(map4.values()).equals(new HashSet<>(map5.values())));
		System.out.println(new HashSet<>(map4.values()).equals(new HashSet<>(map6.values())));
	}

}
