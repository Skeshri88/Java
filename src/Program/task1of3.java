package Program;

public class task1of3 {

	public static void main(String[] args) 
	{
		int array[]= {1,2,3,5,6,7};
		int k=7;
		int temp = 0;
		int len= array.length;
		//System.out.println(len);
		
		
		for(int i=0;i<len;i++)
		{
			if(array[i]<k)
			{
				if(temp<=array[i])
				{
					temp= array[i];
					
				}
			}		
			
		}
		System.out.println(temp);
		
		

	}

}
