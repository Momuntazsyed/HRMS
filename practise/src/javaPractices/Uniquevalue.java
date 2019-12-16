package javaPractices;

import java.util.HashSet;
import java.util.Set;

public class Uniquevalue {

	public static void main(String[] args) {
		String[] s1= {"janu","sanju","megha","janu","megha"};
		
		Set<String> s=new HashSet<String>();
		for(String value:s1)
		{
			s.add(value);
			
			
		}
		
		System.out.println(s);
	}

}
