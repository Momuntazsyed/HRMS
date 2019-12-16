package javaPractices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicateelements {

	public static void main(String[] args) {
		//using arraylist for storing duplicate elements
		ArrayList<String> elements=new ArrayList<String>();
		elements.add("Janujv");
		elements.add("Janujv");
		elements.add("lakshmi");
		elements.add("mahitha");
		elements.add("mahitha");
		//crete set iinterface for removing the duplicates
		Set<String> s1=new HashSet<String>();
		//retriving the all ements into single elements
		for(String duplicate:elements)
		{
			//check duplication
			if(s1.add(duplicate)==false)
		System.out.println(duplicate);
		
	}

}
}
