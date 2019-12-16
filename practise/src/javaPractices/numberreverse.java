package javaPractices;

public class numberreverse {

	public static void main(String[] args) {
	int reverse=0;
		int num=2334908;
		while(num!=0)
		{
			reverse=reverse*10+num%10;
			num=num/10;
			
		}

		
		System.out.println(reverse);
	}

}
