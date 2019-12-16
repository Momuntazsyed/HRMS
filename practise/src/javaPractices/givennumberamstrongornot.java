package javaPractices;

public class givennumberamstrongornot {

	public static void main(String[] args) {
		int num=153;
		int r;
		int sum=0;
		int temp=num;
		while(num!=0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("given number is amstrong");
		}
		else {
			System.out.println("not smdtrong");
		}
	}

}
