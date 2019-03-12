import java.util.Random;
public class DriveThroughWindow
{
	public static void main (String [ ] args)
	{
		Window wind1 = new Window ( );
		Window wind2 = new Window ( );
		Window wind3 = new Window ( );
		Kitchen kitchen1 = new Kitchen ( );
		Random gen  = new Random ();
		int clock1 = 0;
		int clock2 = 0;
		int clock3 = 0;
		do
		{
			int whatHappens = gen.nextInt (10);
			if (whatHappens == 0)
			{
				System.out.println ("Drive Through closed");
				break;
			}
			else if (whatHappens % 2 == 0 )
			{
				if(clock1 == 0)
				{
					System.out.println ("\n\nwelcome to Junk Food Restaurant window 1 .....\n");
					wind1.Window ();
					kitchen1.updateKitchen (wind1.getOrder ( ));
					clock1 = 5;
				}
				if(clock2 == 0)
				{
					System.out.println ("\n\nwelcome to Junk Food Restaurant window 2 .....\n");
					wind2.Window ();
					kitchen1.updateKitchen (wind2.getOrder ( ));
					clock2 = 5;
				}
				if(clock3 == 0)
				{
					System.out.println ("\n\nwelcome to Junk Food Restaurant window 3 .....\n");
					wind3.Window ();
					kitchen1.updateKitchen (wind3.getOrder ( ));
					clock3 = 5;
				}
				else if (clock1 != 0)
				{
					clock1 --;
					System.out.println ("....busy serving one client at window 1..." + 
							"please come back in " + clock1 + " minutes...");
				}
				else if (clock2 != 0)
				{
					clock2 --;
					System.out.println ("....busy serving one client at window 2..." + 
							"please come back in " + clock2 + " minutes...");
				}
				else if (clock3 != 0)
				{
					clock3 --;
					System.out.println ("....busy serving one client at window 3..." + 
							"please come back in " + clock3 + " minutes...");
				}
			//	if(kitchen1.getKitch() == 0)
			//	{
			//		break;
			//	}

				else
				{
					System.out.println("No customers. Waiting.........");
				}

			}

		} while (kitchen1.getKitch() == 0);

	}
}
