package week3.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		/*
		 * LearnStatic obj=new LearnStatic(); obj.add();
		 */
		LearnStatic.manipulation();
	
		Set<String> mentorsName=new HashSet<String>();
		
		mentorsName.add("Aravind");
		mentorsName.add("Vinoth");
		mentorsName.add("Ragu");
		mentorsName.add("Gokul");
		mentorsName.add("Aravind");
		mentorsName.add("");
		
		System.out.println(mentorsName);
		
		Set<String> mentor=new LinkedHashSet<String>(mentorsName);
		System.out.println(mentor);		
		
		Set<String> mentors=new TreeSet<String>(mentorsName);
		System.out.println(mentors);
		
		//not allowed to reterive the data from the set based on the index
		//no get () is available , Set is depending on the impln class
		
		/*
		 * m=Aravind
		 * m=vinoth
		 * 
		 * 
		 * 
		 * 
		 * for(int i=0;i<listLength;i++) { list.get(i) }
		 */
		
		//advanced for loop-->for each
		for (String m : mentors) {
			System.out.println(m);
		}
			
		//Convert the set into list -->get()
		List<String> menValues=new ArrayList<String>(mentors);
		
		menValues.addAll(mentors);
		System.out.println(menValues.get(2));
		
		for(int i=0;i<menValues.size();i++)
		{
			System.out.println(menValues.get(i));
		}

		

	}

}
