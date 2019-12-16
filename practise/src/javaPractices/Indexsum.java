package javaPractices;

public class Indexsum {
	
	public static void main(String[] args) {
		int array[]= {10,20,3,5,7,6,4};
		int sum=9;
		int c,i,j;
		for(i=0;i<array.length;i++)
		{
			for(j=i+1; j<array.length;j++) {
		 
		if(array[i]+array[j] == sum)
        {
			System.out.println("index value is:"+ i +","+j);
            System.out.println(array[i]+" + "+array[j]+" = "+sum);
        }
		
}
		}
	}

	}

