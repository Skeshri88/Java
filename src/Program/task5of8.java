package Program;

import java.util.Arrays;

public class task5of8
{
	static void moveZeroLast(int inputArray[])
	{
	int counter=0;
	for(int i=0;i<inputArray.length;i++)
	{
	if(inputArray[i]!=0)
	{
	inputArray[counter]=inputArray[i];
	counter++;
	}
	}
	while(counter<inputArray.length)
	{
	inputArray[counter]=0;
	counter++;
	}
	System.out.println(Arrays.toString(inputArray));
	}
	public static void main(String args[])
	{
	moveZeroLast(new int [] {14,0,5,2,0,3,0});
	}


}
