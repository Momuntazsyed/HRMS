package javaPractices;

public class pangram {

	public static void main(String[] args) {
String x="the quick brown fox jumps over a lazy dog";
  x=x.replaceAll(" ", "");
  System.out.println(x);
  char y[]=x.toCharArray();
  System.out.println(y.length);
   
  int size=y.length;
  int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
  System.out.println(a.length);
  int i=0;
  while(i !=size)
  {
	  int index=y[i]-65;
	  a[index]=1;
	  ++i;
  }
i=0;
while(i!=26)
{
	if(a[i]==1)
	{
		++i;
	}
	else {
		System.out.println("not a pangram");
		System.exit(0);
	}
}
System.out.println("pangram");
	}

}
