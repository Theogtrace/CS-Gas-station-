import java.util.Random;
public class GasStation
{
	public static void main (String [ ] args)
	{
		GasPump pump1 = new GasPump ( );
		GasPump pump2 = new GasPump ( );
		GasPump pump3 = new GasPump ( );
		GasPump pump4 = new GasPump ( );
		GasPump pump5 = new GasPump ( );
		MainClass MainClass1 = new MainClass ( );
		Random gen  = new Random ();
		WaitingLine line = new WaitingLine ( );

		int numOfWaitingClients;	



		int clock1 = 0;
		int clock2 = 0;
		int clock3 = 0;
		int clock4 = 0;
		int clock5 = 0;


		do
		{

			int whatHappens = gen.nextInt (20);
			if (whatHappens % 5 == 0 )
			{
				Client aClient = new Client ( );
				numOfWaitingClients = line.getNumOfWaitingClients ( );
				
				if(numOfWaitingClients == 0)
				{

					if(clock1 == 0)
					{
						clock1 = 10;
						System.out.println ("welcome to Saad's GasStation Pump 1 ");
						pump1.Window (aClient);
						MainClass1.updateMainClass (pump1.getOrder ( ));

					}
					else if(clock2 == 0)
					{

						clock2 = 10;
						System.out.println ("welcome to Saad's GasStation Pump 2 ");
						pump2.Window (aClient);
						MainClass1.updateMainClass (pump2.getOrder ( ));

					}
					else if(clock3 == 0)
					{
						clock3 = 10;
						System.out.println ("welcome to Saad's GasStation Pump 3 ");
						pump3.Window (aClient);
						MainClass1.updateMainClass (pump3.getOrder ( ));

					}
					else if(clock4 == 0)
					{
						clock4 = 10;
						System.out.println ("welcome to Saad's GasStation Pump 4 ");
						pump4.Window (aClient);
						MainClass1.updateMainClass (pump4.getOrder ( ));

					}
					else if(clock5 == 0)
					{
						clock5 = 10;
						System.out.println ("welcome to Saad's GasStation Pump 5 ");
						pump5.Window (aClient);
						MainClass1.updateMainClass (pump5.getOrder ( ));

					}
					else
					{
						line.addAClient(aClient); System.out.println ("add 1 client");
						System.out.println ("Number of people in waiting line " + numOfWaitingClients);
					}
					
					

				}
				numOfWaitingClients = line.getNumOfWaitingClients ( );
				System.out.println ("Number of people in waiting line " + numOfWaitingClients);
				if(numOfWaitingClients!=0) 
				{
					line.getNextClientInLine ( );
					if(clock1 == 0)
					{
						clock1 = 10;
						System.out.println ("welcome to Saad's GasStation Pump 1 ");
						pump1.Window (aClient);
						MainClass1.updateMainClass (pump1.getOrder ( ));

					}
					else if(clock2 == 0)
					{

						clock2 = 10;
						System.out.println ("welcome to Saad's GasStation Pump 2 ");
						pump2.Window (aClient);
						MainClass1.updateMainClass (pump2.getOrder ( ));

					}
					else if(clock3 == 0)
					{
						clock3 = 10;
						System.out.println ("welcome to Saad's GasStation Pump 3 ");
						pump3.Window (aClient);
						MainClass1.updateMainClass (pump3.getOrder ( ));

					}
					else if(clock4 == 0)
					{
						clock4 = 10;
						System.out.println ("welcome to Saad's GasStation Pump 4 ");
						pump4.Window (aClient);
						MainClass1.updateMainClass (pump4.getOrder ( ));

					}
					else if(clock5 == 0)
					{
						clock5 = 10;
						System.out.println ("welcome to Saad's GasStation Pump 5 ");
						pump5.Window (aClient);
						MainClass1.updateMainClass (pump5.getOrder ( ));

					}
					else
					{
						line.addAClient(aClient);
					}

				} 
				
				if (clock1 != 0)
				{
					clock1 --;
				}
				if (clock2 != 0)
				{
					clock2 --;
				}
				if (clock3 != 0)
				{
					clock3 --;
				}
				if (clock4 != 0)
				{
					clock4 --;
				}
				if (clock5 != 0)
				{
					clock5 --;
				}

			}
		}while (MainClass1.getPump() == 0);
	}
}