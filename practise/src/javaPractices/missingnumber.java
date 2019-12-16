package javaPractices;

public class missingnumber {

	public static void main(String[] args) {
		int num1[]= {1,2,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<num1.length;i++)
		{
			sum=sum+num1[i];
		}
   
		int sum2=0;
		System.out.println(sum);
		for(int j=1;j<=10;j++)
		{
			sum2=sum2+j;
		}
		
		
		System.out.println(sum2);
		System.out.println("missing element are:"+(sum2-sum));
	}
	

}
