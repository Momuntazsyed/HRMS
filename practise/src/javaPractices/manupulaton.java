package javaPractices;

public class manupulaton {

	public static void main(String[] args) {
		String s="       this_is_a_java programming language               ";
		 System.out.println(s.charAt(3));
		 
		System.out.println(s.indexOf("s"));
		System.out.println(s.substring(0, 15));
		System.out.println(s.replace("programming", "Selenuim"));
		//System.out.println(s.split("_"));
	}

}
