package Program;

public class Task4of5 
{

	public static void main(String[] args)
	{
		int rows=0;
		int  column=0;
		int a[][]={{1,2,3}, {4,5,6},{7,8,9}};
		                     
		                    
		                     
		                                    
		rows= a.length;
		column =a[0].length;
		if(rows!=column)
		{
		System.out.println("Matrix should be a square matrix");
		}
		else 
		{
		System.out.println("Lower trainglar matrix");
		for(int i=0;i<rows;i++)
		{
		for(int j=0;j<column;j++)
		{
		if(j>i)
		System.out.println("0");
		else 
		{
		System.out.println(a[i][j]+ " ");
		}
		System.out.println();
		}
		}
		}
	}
}






