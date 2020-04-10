package Program;

import java.util.HashMap;

public class Task5of3 
{
	public static void CountCharr(String str)
	{
	HashMap<Character, Integer>  charCountMap= new HashMap<Character, Integer>();
	char[] strArray= str.toCharArray();
	for(char c: strArray)
	{
	if(charCountMap.containsKey(c))
	{
	charCountMap.put(c,charCountMap.get(c)+1);
	}
	else 
	{
	charCountMap.put(c, 1);
	}
	}
	System.out.println(str+ " : "+ charCountMap);
	}
	public static void main(String args[])
	{

	CountCharr("Java J2EE Java JSP J2EE");
	}


}
