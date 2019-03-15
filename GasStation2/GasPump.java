import java.util.Scanner;

public class GasPump
{
	private Order anOrder;
	private Client current;
	public void Window(Client nClient)
	{
		Scanner kbd = new Scanner (System.in);
		final int UNIT_PRICE_REGULAR = 3;
		final int UNIT_PRICE_PREMUM = 4;
		final int UNIT_PRICE_SUPERR = 5;
		
		current = nClient;
		anOrder = new Order ( );
		while (true)
		{
			System.out.println("Welcome to the gas pump " +current.getCarTag());
			System.out.println ("\n***menu***\n" +
					"\n1: regular: $" + UNIT_PRICE_REGULAR +
					"\n2: premum: $" + UNIT_PRICE_PREMUM +
					"\n3: superr: $" + UNIT_PRICE_SUPERR +
					"\n4: check out" +
					"\nenter your choice: ");
			int ordered = kbd.nextInt ( );
			if (ordered == 4)
				break;
			else
			{
				System.out.println ("how much? ");
				int howMany = kbd.nextInt ( );
				Item newItem = null;
				switch (ordered)
				{
				case 1: newItem = new Item ("regular", UNIT_PRICE_REGULAR,howMany);break;
				case 2: newItem = new Item ("premum", UNIT_PRICE_PREMUM,howMany); break;
				case 3: newItem = new Item ("superr", UNIT_PRICE_SUPERR,howMany);

				}
				anOrder.addOneItem (newItem);

			}

		}

		System.out.println (anOrder);

	}
	
	public void setClient (Client nClient)
	{
		current = nClient;
	}
	
	public Client getCurrentClient ()
	{
		return current;
	}
	public Order getOrder( )
	{
		return anOrder;
	}


}