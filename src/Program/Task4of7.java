package Program;

public class Task4of7 {

	public static void main(String[] args) 
	{
		int rows;
		int column;
		int evenCount=0;
		int OddCount=0;

		int a[][]={{1,2,3},{4,5,6}, {7,8,9}};
		rows=a.length;
		column=a[0].length;

		for(int i=0;i<rows;i++)
		{
		for(int j=0;j<column;j++)
		{
		if(a[i][j]%2==0)
		evenCount++;
		else
		OddCount++;
		}
		}
		System.out.println( "evenCount "+ evenCount);
		System.out.println("oddCount "+OddCount);


	}

}
