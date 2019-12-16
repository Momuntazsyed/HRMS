package javaPractices;

public class swaptwosting {

	public static void main(String[] args) {
		String s1="janujv";
		String s2="mobeenasyed";
		System.out.println("Before Swapping String");
		System.out.println(s1);
		System.out.println(s2);
	s1=s1+s2;//Helloworld
	
	s2=s1.substring(0, s1.length()-s2.length());
	
s1=s1.substring(s2.length());
System.out.println("After swapping:");
System.out.println(s1);  
System.out.println(s2);
	}

}
