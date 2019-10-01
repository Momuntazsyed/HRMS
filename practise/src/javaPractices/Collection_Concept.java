package javaPractices;

import java.util.ArrayList;
import java.util.List;

public class Collection_Concept {

	public static void main(String[] args) {
	List<Integer> l1=new ArrayList<Integer>();
	l1.add(20);
	l1.add(30);
	l1.add(40);
	l1.add(50);
	//l1.remove(2);
	//replace 0 index value
	l1.set(0, 100);
	System.out.println(l1);
	List<String> l2=new ArrayList<String>();
	
	l2.add("janujv");
	l2.add("mobeena");
	l2.add("syed");
	System.out.println(l2);
	
	

	}

}
