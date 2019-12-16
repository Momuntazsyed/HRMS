package javaPractices;

import java.util.HashSet;

public class intersectionofarray {

	public static void main(String[] args) {
		 String arr1[]= {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		 String arr2[]= {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		 HashSet<String> set = new HashSet<String>();
		 for(int i=0;i<arr1.length;i++) {
			 for(int j=0;j<arr2.length;j++) {
				 
				 if(arr1[i]==arr2[j]) {
					 
					set.add(arr1[i]) ;
				 }
			 }
		 }
		 System.out.println("Common Elements : "+set);  
	}

}
