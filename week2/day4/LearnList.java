package week2.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		
		//syntax 
		//List<WrapperClass> listName=new ArrayList<WrapperClass>();
		//<>
		
		List<String> mentors =new ArrayList<String>();
		
		//add,remove,contains,retainAll, removeAll,empty ,clear
		mentors.add("Vinoth");
		mentors.add("Raghu");
		mentors.add("Gokul");
		mentors.add("Princila");
		mentors.add("Princila");
		
		System.out.println(mentors);
		
		List<String> nmentors =new ArrayList<String>(mentors);
		
		//nmentors.addAll(mentors);
		System.out.println(nmentors);
	//	retrive a particular element from the list
		String string = nmentors.get(1);//index starts with zero
		System.out.println(string);
		
		nmentors.set(1, "Vidya");//replace the value from the particular
		System.out.println(nmentors);
		nmentors.add("Raghu");
		System.out.println(nmentors);
		
		System.out.println(nmentors.contains("Vidya"));
		
		nmentors.remove(3);
		System.out.println(nmentors);
		
		/*
		 * nmentors.removeAll(mentors); //removes the common datas
		 * System.out.println(nmentors);
		 */
		nmentors.retainAll(mentors); //holds the common datas 
		System.out.println(nmentors);
				
	//to sort the list
		Collections.sort(nmentors);
		System.out.println(nmentors);
		
		Collections.reverse(nmentors);
		
		Object[] array = nmentors.toArray();
		//print the array directly
		System.out.println(Arrays.toString(array));
		nmentors.clear();
		System.out.println(nmentors.isEmpty());
		
		
		
		
	}

}
