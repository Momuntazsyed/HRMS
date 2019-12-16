
package javaPractices;

public class numberrevers {
  public static void main(String args[])
  {
	  int r=0;
	  int num=24666756;
	   while(num!=0)
	   {
		  r=(r*10)+num%10;
		  num=num/10;
	   }
	 //  System.out.println(num);
	   System.out.println(r);
  }
}
