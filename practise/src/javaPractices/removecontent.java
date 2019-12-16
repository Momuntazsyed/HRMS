package javaPractices;

public class removecontent {

	public static void main(String[] args) {
		String s1="testing245235Java$@!3133#*@$&*&*Manual764187Selenium90884274%@%";
		  
	String s2= s1.replaceAll("[^a-zA-Z]", "");
		System.out.println(s2);
	}

}
