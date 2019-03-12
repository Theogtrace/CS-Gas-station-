import java.util.Scanner;

public class Window
{
	private Customer who;
	private String carTag;
	private Order anOrder;

	public void Window()
	{
		who = null;
		who = new Customer ();
		Scanner kbd = new Scanner (System.in);
		final int UNIT_PRICE_BURGER = 5;
		final int UNIT_PRICE_FRIES = 2;
		final int UNIT_PRICE_DRINKS = 1;
		anOrder = new Order ( );
		while (true)
		{
			System.out.println ("\n***menu***\n" +
					"\n1: burger: $" + UNIT_PRICE_BURGER +
					"\n2: fries: $" + UNIT_PRICE_FRIES +
					"\n3: drinks: $" + UNIT_PRICE_DRINKS +
					"\n4: check out" +
					"\nenter your choice: ");
			int ordered = kbd.nextInt ( );
			if (ordered == 4)
				break;
			else
			{
				System.out.println ("how many? ");
				int howMany = kbd.nextInt ( );
				Item newItem = null;
				switch (ordered)
				{
				case 1: newItem = new Item ("burger", UNIT_PRICE_BURGER,howMany);break;
				case 2: newItem = new Item ("fries", UNIT_PRICE_FRIES,howMany); break;
				case 3: newItem = new Item ("drinks", UNIT_PRICE_DRINKS,howMany);

				}
				anOrder.addOneItem (newItem);

			}

		}

		System.out.println (anOrder);

	}
	public Order getOrder( )
	{
		return anOrder;
	}

	private void resetWindow( )
	{
		who = null;
	}

	public boolean windowAvailable ()
	{
		return (who == null);
	}

}