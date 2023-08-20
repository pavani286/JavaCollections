package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static void main(String[] args) {
	/*
		ArrayList<String> arr = new ArrayList<String>(Arrays.asList("Tom","Peter","Smith","Apple"));
		arr.add("boy");
		arr.add("Smith");
		System.out.println(arr);
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("AAA");
		arr1.add("BBB");
		arr1.add("CCC");
		
		System.out.println(arr1);
		
		ArrayList<String> arrayListObject = new ArrayList<String>();
		arrayListObject.add("aaa");
		arrayListObject.add("bbb");
		arrayListObject.add("ccc");
		
		System.out.println(arrayListObject);
		
		ArrayList<String> arrayListClone =  new ArrayList<String>(arrayListObject);
		arrayListObject.clone();
		
		System.out.println(arrayListClone);
		*/
		ArrayList<Integer> i = new ArrayList<Integer>();
		i.add(1);
		i.add(2);
		i.add(3);
	    i.add(4);
	    
		ArrayList<Integer> i1 = new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,4,5,6));
		
		System.out.println("*****adding the elements **********");
		ArrayList<Integer> add = new ArrayList<Integer>(i);
		add.addAll(i1);
	    System.out.println(add);
		
		System.out.println("********Removing the duplicate elements or extra values *************");
		ArrayList<Integer> i2 = new ArrayList<Integer>(i);
		i2.removeAll(i1);
		
		System.out.println(i1);
		
		System.out.println("******** common element's would be displayed ********************");
		ArrayList<Integer> i3 = new ArrayList<Integer>(i);
		i3.retainAll(i1);
		System.out.println(i3);
	}

}
