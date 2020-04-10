package Program;

public class Task4of2 {

	public static void main(String[] args)
	{
		int rows, columns;
		int sumRow,sumCol;
		boolean flag = true;
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};	        
		rows=a.length;
		columns=a[0].length;

		for(int i=0;i<rows;i++)
		{
		sumRow=0;
		for(int j=0;j<columns;j++)
		{
		sumRow= sumRow+a[i][j];
		}
		System.out.println(sumRow);
		}
		

		for(int i=0;i<columns;i++)
		{
		sumCol =0;
		for(int j=0;j<rows;j++)
		{
		sumCol=sumCol+a[j][i];
		}
		System.out.println(sumCol);
		}


	}

}
