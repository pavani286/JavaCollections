package JavaCollections;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingHashMap {

	public static void main(String[] args) {
	//1. basic hash map 
		HashMap<String,Integer>  map = new HashMap<String,Integer>();
	       map.put("balaji", 10);
	       map.put("Aryan", 30);
	       map.put("pavani", 10);
	       map.put("Aditya", 10);
	       map.put(null, 40);
	       
    //2. Immutable map with one single entry
	       Map<String,Integer> map1= Collections.singletonMap("tom", 100);
		      System.out.println(map1);
   //3.  Mutable map : with miultiple entries  using stream.of
		     Map<String,String> entry= Stream.of(
		    		                   new AbstractMap.SimpleEntry<>("tom","java"),
		    		                   new AbstractMap.SimpleEntry<>("peter","python"),
		    		                   new AbstractMap.SimpleEntry<>("smith","c")	
		    		                   ).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		     System.out.println(entry.get("peter"));
		     entry.put("Lisa", null);
		     entry.put(null,"zero");
		     entry.put(null,"zero1");
		     System.out.println(entry.get("Lisa"));
		     System.out.println(entry.values());
		     entry.put("tom","100");
	         System.out.println(entry.get("tom"));
 	     
  //4. jdk 1.9
	  //1. how to create empty map
	       Map<String,Integer> Emptymap = Map.of();
	       //Emptymap.put("tom", 100);
	       //System.out.println(Emptymap.get("tom"));
	       /* will get unsupported operation exception 
	        * if you try to insert value into emptymap */
	       
	 //2.how to create singletonmap having single entry
	       Map<String,Integer> singletonmap = Map.of("tom",100);
	       System.out.println(singletonmap);
	      // singletonmap.put("jack", 400); // we will get error if we try to put the value in hashmap 
	                                      // because it is singleton map have only entry
	       
     //3. Multiple Entry but 1maximum 10 pairs is allowed
	       Map<String,Integer> multimap = Map.of("tom",100,"tom2",200,"tom3",300,
	    		                                 "tom4",400,"tom5",500,
	    		                                 "tom6",600,"tom7",700);
	          // multimap.put("tom8", 800); // will get exception(java.lang.UnsupportedOperationException)
	  
	 //4. Unlimited multipile entries   
	      Map<String, Integer> map2 = Map.ofEntries(new AbstractMap.SimpleEntry<>("tom", 100),
			                                   new AbstractMap.SimpleEntry<>("peter",200),
			                                   new AbstractMap.SimpleEntry<>("smith",300),
			                                   new AbstractMap.SimpleEntry<>("Alex",400)
			 );
	      System.out.println(map2);
	      //map2.put("pavani", 400);
	
	 
	}
	

}
