package Program;

import java.util.Scanner;

public class Task1Of1 {

	public static void main(String[] args)
	{
		String reverse="";
		Scanner s= new Scanner( System.in);
		System.out.println("Enter a String to reverse");
		String  original= s.nextLine();

		int length = original.length();
		for(int i=length-1;i>=0;i--)
		{
		reverse= reverse +original.charAt(i);
		}
		System.out.println("Reverse of the String:"+ reverse);

	}

}
