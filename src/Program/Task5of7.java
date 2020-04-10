package Program;

public class Task5of7
{
	
	public static void main(String args[])
	{
	String S1= "JavaJ2eeStrutsHibernate";
	String S2= "StrutsHibernateJavaJ2ee";

	if(S1.length()!=S2.length())
	{
	System.out.println("S2 is not rotation of S1");
	}
	else
	{
	String S3=S1+S2;
	if(S3.contains(S2))
	{
	System.out.println("S2 is rotation of S1");
	}
	else 
	{
	System.out.println("S2 is not rotation of S1");
	}
	}
	}


}
