package Program;

public class task4of4 {

	public static void main(String[] args) 
	{
		int row1=0;
		int row2=0;
		int column1=0;
		int column2=0;
		boolean flag = true;
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		                                                    
		int b[][]= {{1,2,3}, {4,5,6},{7,8,9}};
		             
		row1= a.length;
		column1=a[0].length;

		row2= b.length;
		column2=b[0].length;

		if(row1!=row2 || column1!=column2)
		{
		System.out.println("Matrics are not equal");
		}
		else 
		{
		for(int i=0;i<row1;i++)
		{
		for(int j=0;j<column1;j++)
		{
		if(a[i][j]!=b[i][j])
		{
		flag= false;
		break;
		}
		}
		}

		if(flag)
		System.out.println("Matrics are equal");
		else
		System.out.println("Matrics are not equal");
		}


	}

}
