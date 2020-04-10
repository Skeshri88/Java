package Program;

public class task5of9
{
	static int AddNumber(int n)
	{
	int sum=(n*(n+1))/2;
	return sum;
	}
	static int SumElements(int[]  array)
	{
	int sum=0;
	for(int i=0;i<array.length;i++)
	{
	sum=sum+array[i];
	}
	return sum;
	}
	public static void main (String args[])
	{
	int n=8;
	int[] a={1,4,5,3,7,8,6};
	int AddNumber= AddNumber(n);
	int SumElements=SumElements(a);
	 int missingNumber= AddNumber-SumElements;
	System.out.println("MissingNumber is ="+ missingNumber);
	}


}
