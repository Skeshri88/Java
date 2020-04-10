package Program;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2of8 {

	public static void main(String[] args)
	{
		String S1[]={"A", "B", "C"};
		String S2[]={"D", "E", "F"};

		ArrayList l= new ArrayList(Arrays.asList(S1));
		l.addAll(Arrays.asList(S2));
		Object[] S3= l.toArray();
		System.out.println(Arrays.toString(S3));


	}

}
