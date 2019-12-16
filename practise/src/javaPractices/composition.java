package javaPractices;

public class composition {
	
	
static int largest(int a,int b)
{
	int c=0;
	while(a!=0 && b!=0)
	{
		a++;
		b++;
		c--;
		
	}
	
	System.out.println("c"+c);
	return c;
	
}
	
	
	
	
public static void main(String args[])
{
	    
	int a=5; int b=6;
	System.out.println("lagest number is:"+largest(a,b));
	
}
	
	
	}


