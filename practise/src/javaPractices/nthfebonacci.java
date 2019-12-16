package javaPractices;

public class nthfebonacci {
	
	
	
	public static void main (String args[])
	{
		int temp;
		int arr[]= {10,20,35,78,45,34};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		int size = arr.length;
		System.out.println("second largest number is:"+arr[1]);
	}
}
