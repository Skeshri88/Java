package Program;

import java.util.HashMap;
import java.util.Set;

public class Task5of1
{
	static void duplicate(String str)
	{
	HashMap<Character,Integer> t= new HashMap<Character,Integer>();
	char[] carray= str.toCharArray();
	for(char c: carray)
	{
	if(t.containsKey(c))
	{
	t.put(c,t.get(c)+1);
	}
	else
	{
	t.put(c,1);
	}
	}
	Set<Character> setchar=t.keySet();
	System.out.println("Dupliacte in" + str);
	for(Character c : setchar)
	{
	if(t.get(c)>1)
	{
	System.out.println(c+ " " + t.get(c));
	}
	}


	}
	
	public static void main(String args[])
	{
	duplicate("BetterButter");
	}

}
