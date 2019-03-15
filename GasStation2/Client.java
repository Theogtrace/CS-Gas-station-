import java.util.Random;
import java.util.Scanner;
public class Client
{
	private String carTag;
	public Client()
	{
		Random gen = new Random ( );
		carTag = "";
		for (int i = 1; i <= 6; i++)
		{
			
			//a random number between 48 and 90
			int code = gen.nextInt (43)+ 48;
			if ((code <= 64) && (code >= 58))
			{
				i--;
				continue;
			}
			
			carTag += ((char)(code));
			
		}
		
		System.out.println ("a car arrives; tag number:" + carTag);
		
	}
	
	public void resetClientTag ()
	{
		carTag = null;
	}
	
	public String getCarTag ()
	{
		return carTag;
	}
}