package javaPractices;

public class palendrome {

	public static void main(String[] args) {
		int num=454;
		int reverse=0;
		int sum=0;
		int temp=num;
		 while(num>0) {
			 reverse=num%10;
			 sum=(sum*10)+reverse;
			 num=num/10;
			 
		 }
		 if(temp==sum) {
			 System.out.println("given number is palindrome");
		 }
		 else {
			 System.out.println("not palindrome");
		 }
	}

}
