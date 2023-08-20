package JavaCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<String,Integer>  map = new HashMap<String,Integer>();
	       map.put("balaji", 10);
	       map.put("Aryan", 30);
	       map.put("pavani", 10);
	       map.put("Aditya", 10);
	       map.put(null, 40);
	       map.put(null, 0);     /* if we insert more than one null key hashmap will neglect the old 
	                                 key and consider the new key and value */
	       System.out.println("Size of map is: "
	               + map.size());
	       System.out.println(map.get("balaji"));
	       
	       //1.iterate over the keys using keyset()
	      System.out.println("*********using keyset() for extracting  keys only ***************");
	      Iterator<String> it = map.keySet().iterator();
	      while(it.hasNext()) {
	    	  String key = it.next();
	    	  // Integer value = map.get(key);
	    	  System.out.println("key = "+key); 
	                        }
	 
	      //2. iterator over the set(pair) using entryset()
	      
	      System.out.println("*******using entryset() for key-value pairs **************");
	      Iterator<Entry<String, Integer>> it1 = map.entrySet().iterator();
	      while(it1.hasNext()) {
	    	  Entry<String, Integer> entry = it1.next();
	    	  System.out.println("key = "+entry.getKey()+ " value = " +entry.getValue());
	    	  
	                  }
	      
	      //3.iterate over the values using values()
	      
	    System.out.println("******using values() for extracting values only ******************");
	    Iterator<Integer> it2 = map.values().iterator();
	    while(it2.hasNext()) {
	    	   Integer value =  it2.next();
	    	  System.out.println("value = "+value); 
	           }
	      
		}
	
}
