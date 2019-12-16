package javaPractices;

import java.util.Arrays;

public class Smallestandlargestnumber {

	public static void main(String[] args) {	
	
	
	int arr[]= {20,34,8,9,3,15,1};
	int smalest=arr[0];
	int largest=arr[0];
	 for (int i=0;i<arr.length;i++)
	 {
		 
		 if(arr[i]>largest)
		 {
			 largest=arr[i];
		 }
		if (arr[i]<smalest) {
			
			 
			smalest=arr[i];
			 
		 }
		 
		 
		 
	 }
	
	System.out.println("given array:"+Arrays.toString(arr));
	System.out.println("largest number is:"+largest);
	
	System.out.println("smallest number is:"+smalest);
	
	

	}

}
