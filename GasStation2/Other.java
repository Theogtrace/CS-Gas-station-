import java.util.Random;
public class GasStation
{


	public static void main (String [ ] args)
	{
		int size = 5;
		GasPump[] pumpArray = new GasPump[size];
		for (int index =0; index < pumpArray.length; index ++)
		{
			pumpArray[index] = new GasPump();
		}
		MainClass MainClass1 = new MainClass ( );
		Random gen  = new Random ();
		WaitingLine line = new WaitingLine ( );

		int numOfWaiting;	
		int[] MasterClock = new int[5];


		do
		{

			int whatHappens = gen.nextInt (20);
			if (whatHappens % 5 == 0 )
			{
				Client aClient = new Client ( );
				numOfWaiting = line.getNumOfWaitingClients ( );

				if(numOfWaiting == 0)
				{
					for (int count =0; count < MasterClock.length; count++)
					{
						if(MasterClock[count] == 0)
						{
							int number = count +1;
							System.out.println ("welcome to Saad's GasStation Pump " + number);
							pumpArray[count].Window(aClient);
							MainClass1.updateMainClass (pumpArray[count].getOrder ( ));
							MasterClock[count]--;
						}
						else
						{
							line.addAClient(aClient); System.out.println ("add 1 client");
							System.out.println ("Number of people in waiting line " + numOfWaiting);
						}


					}
					numOfWaiting = line.getNumOfWaitingClients ( );
					System.out.println ("Number of people in waiting line " + numOfWaiting);
					if(numOfWaiting!=0) 
					{
						line.getNextClientInLine ( );
						for (int count =0; count < MasterClock.length; count++)
							if(MasterClock[count] == 0)
							{
								int number = count +1;
								System.out.println ("welcome to Saad's GasStation Pump " + number);
								pumpArray[count].Window(aClient);
								MainClass1.updateMainClass (pumpArray[count].getOrder ( ));
								MasterClock[count]--;
							}
							else
							{
								line.addAClient(aClient); System.out.println ("add 1 client");
								System.out.println ("Number of people in waiting line " + numOfWaiting);
							}

					}
				}
			}
		}while (MainClass1.getPump() == 0);
	}
}