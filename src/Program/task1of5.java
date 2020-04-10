package Program;

public class task1of5
{
	static boolean isPowerOftwo(int n)
	{
		if(n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;		
		}
		return true;
		
	}

	public static void main(String[] args)
	{
		if(isPowerOftwo(64))
		{
			System.out.println("N is a power of 2");
		}
		else 
		{
			System.out.println("N is not a power 2");
		}
		

	}

}
