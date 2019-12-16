package javaPractices;

public class prime {

	public static void main(String[] args) {
		
		int num=2;
  //for(int i=1;i<=100;i++)
 // {
	  int temp=0; 
		for(int j=2;j<=num-1;j++)
		{
			if(num%j==0)
			{
				temp=temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("given  number prime");
		}
		else {
			System.out.println("Not prime");
		}
	
	}//
	}


