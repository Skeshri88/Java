package Program;

import java.util.Arrays;

public class Task5of4 
{
	static void SumPairs(int inputArray[],int inputNumber)
	{
	Arrays.sort(inputArray);
	System.out.println("Sum of Pair Element " + inputNumber);
	int i=0;
	int j=inputArray.length-1;
	while(i<j)
	{
	if(inputArray[i]+ inputArray[j]==inputNumber)
	{
	System.out.println(inputArray[i]+ "  "+ inputArray[j]+ "= " + inputNumber);
	i++;
	j--;
	}
	else if(inputArray[i]+ inputArray[j]<inputNumber)
	{
	i++;
	}
	else if(inputArray[i]+ inputArray[j]>inputNumber)
	{
	j--;
	}
	}
	}

	public static void main(String args[])
	{
	SumPairs(new int[] {4,5,7,11,9,13,8,12}, 20);
	}


}
