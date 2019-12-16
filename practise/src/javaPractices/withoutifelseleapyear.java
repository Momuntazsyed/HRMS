package javaPractices;

public class withoutifelseleapyear {
public static void main(String args[])
{
//using Ternary operator
	int year=2016;
	System.out.println("give year is :"+ ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))? " aleap yera":"not leape year"));
	//System.out.println("bigger value = " +( (a > b)? a : b));



}
}
