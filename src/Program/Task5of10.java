package Program;

import java.util.HashMap;
import java.util.Scanner;

public class Task5of10
{
	static void repetandnon(String input)
	{
	HashMap<Character,Integer> charCountMap= new HashMap<Character,Integer>();
	char[] strArray= input.toCharArray();
	for( char c: strArray)
	{
	if(charCountMap.containsKey(c))
	{
	charCountMap.put(c,charCountMap.get(c)+1);
	}
	else
	{
	charCountMap.put(c,1);
	}
	}

	for(char c: strArray)
	{
	if(charCountMap.get(c)==1)
	{
	System.out.println("First Non-Repeated Character In '"+input+"' is '"+c+"'");
	break;
	}
	}
	

	for(char c: strArray)
	{
	if(charCountMap.get(c)>1)
	{
	System.out.println("First Repeated Character In '"+input+"' is '"+c+"'");
	break;
	}
	}
	}

	public static void main( String args[])
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String :");
	String input = sc.next();
	repetandnon(input);
	}


}
