package JavaCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrenthashMap {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("Tom",100);
        map.put("Peter",200);
        map.put("Smith",300);
        map.put("Lisa",400);
        
        // SynchrnoizedMap
        Map<String,Integer> synchmap = Collections.synchronizedMap(map);
        System.out.println(synchmap);
        System.out.println(synchmap.get("Lisa"));
       
        Map<String,Integer> synchmap1 = Collections.synchronizedMap(map);
        System.out.println(synchmap1);
        synchmap1.put("Katherin", 500);
        System.out.println(synchmap1);
        synchmap1.put("Tom", null);
        System.out.println(synchmap1);
        //ConcurrentHashMap
        ConcurrentHashMap<String,Integer> concurrentmap =  new ConcurrentHashMap<>();
        concurrentmap.put("Java", 2000);
        concurrentmap.put("C",6000);
        concurrentmap.put("C++", 4000);
        System.out.println(concurrentmap);
        System.out.println(concurrentmap.get("C"));    /* multiple read operations are performed but 
                                                        for put operation is locked until the thread is free */
        System.out.println(concurrentmap.get("C++"));
       // concurrentmap.put("Python", null); /* will get exception(java.lang.NullPointerException)
                                             /*if we try to perform put operation */
	}

}
