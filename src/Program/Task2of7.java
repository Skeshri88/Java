package Program;
import java.text.ParseException;
import java.text.SimpleDateFormat;  
import java.util.Date;

public class Task2of7 {

	public static void main(String args[]) throws ParseException 
	{
		String datee = "04/04/2020";
		Date D1= new SimpleDateFormat("dd/mm/yyyy").parse(datee);
		System.out.println(D1);


	}

}
