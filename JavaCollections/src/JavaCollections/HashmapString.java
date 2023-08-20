package JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class HashmapString {

	public static void main(String[] args) {
		
		Map<Employee,Integer> empmap = new HashMap<Employee,Integer>();
		
		Employee emp = new Employee("Smith",25);
		empmap.put(emp, 20);
		
		emp.setEmpAge(40);
		
		//empmap.put(emp, 30);
		
		System.out.println(empmap.get(emp));

		Map<String,Integer> empmap1 = new HashMap<String,Integer>();
		String s= "peter";
		empmap1.put(s,10);
		System.out.println(empmap1.get(s));
		empmap1.put(s, 20);
		System.out.println(empmap1.get("peter"));
		
		
	}

}
