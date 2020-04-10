package Program;

public class Task5of6
{
	public static void CheckBinary(int number)
	{
	boolean binaryno=true;
	int input =number;
	while(input!=0)
	{
	int temp=input%10;
	if(temp>1)
	{
	binaryno=false;
	break;
	}
	else
	{
	input=input/10;
	}
	}
	if(binaryno)
	{
	System.out.println(number + " is binary");
	}
	else
	{
	System.out.println(number + " isnot  binary");
	}


	}
	
	public static void main(String args[])
	{
		CheckBinary(10101);
	}
	

}


