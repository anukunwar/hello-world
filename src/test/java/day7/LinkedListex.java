package day7;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<String> arr = new LinkedList<String>();
		arr.add("Orange");
		arr.add("apple");
		arr.add("Orange");
		arr.add(null);
		arr.add("Orange");
		System.out.println(arr);
		//System.out.println(arr.get(0));
		
		/*for(String c:arr)
		{
			System.out.println(c);
		}*/
		
		Iterator<String> iterator = arr.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		

	}

}
