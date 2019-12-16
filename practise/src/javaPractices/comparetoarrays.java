package javaPractices;

import java.util.Arrays;

public class comparetoarrays {
	
	    public static void main(String[] args)
	    {    
	        int[] arrayOne = {21, 57, 11, 37, 24};
	          
	        int[] arrayTwo = {21, 7, 11, 37, 24};
	          
	        boolean equalOrNot = Arrays.equals(arrayOne, arrayTwo);
	          
	       
	        if (equalOrNot)
	        {
	            System.out.println("Two Arrays Are Equal");
	        }
	        else
	        {
	            System.out.println("Two Arrays Are Not equal");
	        }
	    }
	}

