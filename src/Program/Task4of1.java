package Program;

public class Task4of1 {

	public static void main(String[] args)
	{
		int rows, columns;
		boolean flag = true;
		int a[][]= {{1,0,0},{0,1,0},{0,0,1}};
		                      
		rows=a.length;
		columns=a[0].length;

		if(rows!=columns)
		{
		System.out.println("Matrix should be a square");
		}
		else
		{
		for (int i=0;i<rows;i++)
		{
		for(int j=0;j<columns;j++)
		{
		if(i==j &&a[i][j]!=1)
		{
		flag= false;
		break;
		}
		if(i!=j && a[i][j]!=0)
		{
		flag = false;
		break;
		}
		}
		}
		if(flag)
		System.out.println("Matrix is identity");
		else 
		System.out.println("Matrix is not identity");
		}


	}

}
