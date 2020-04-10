package Program;

public class task2of4 {

	public static void main(String[] args) 
	{
		String  C= "Copy Copy";
		int[] freq= new int[C.length()];
		int I,j;
		char string[]=C.toCharArray();
		for (int i=0;i<C.length();i++)
		{
		freq[i]=1;
		for(j=i+1;j<C.length();j++)
		{
		if(string[i]==string[j])
		{
		freq[i]++;
		string[j]='0';
		}
		}
		}
		System.out.println("Character with frequencies");
		for(int i=0;i<freq.length;i++)
		{
		if(string[i]!=' '&&string[i]!='0')
		System.out.println(string[i]+ " withfreq "+ freq[i]);
		}


	}

}
