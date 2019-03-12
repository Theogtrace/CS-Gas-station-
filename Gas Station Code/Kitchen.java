public class Kitchen
{
	private int burger;
	private int fries;
	private int drinks;
	private double totalRev;
	private int kitch;
	public Kitchen ( )
	{
		burger = 100;
		fries = 100;
		drinks = 100;
		totalRev = 0;
	}

	public void updateKitchen (Order anOrder)
	{
		Item[ ] itemsBeingOrdered = anOrder.getItems ( );
		int sizeBeingOrdered = anOrder.getSize ( );
		
		for (int i = 0; i < sizeBeingOrdered; i++)
		{
			String name = itemsBeingOrdered[i].getName ( );
			int count = itemsBeingOrdered[i].getCount ( );
			if(name.equals("burger"))
			{
				burger = burger - count;
			}
			else if(name.equals("fries"))
			{
				fries = fries - count;
			}
					
			else if(name.equals("drinks"))
			{
				drinks = drinks - count;
			}
					
			totalRev = totalRev + anOrder.getTotalPrice ( );
			System.out.println ("Total hamergurs left = " + burger);
			System.out.println ("Total Fries left = " + fries);
			System.out.println ("Total Drinks left = " + drinks);
			System.out.println ("Total revenue for the day = " + totalRev);
		}
		
	}
	
	public void KitchenAvilable ()
	{
		if(burger > 0 || fries > 0 || drinks >0)
		{
			kitch = 1;
		}
		if (burger == 0 || fries == 0 || drinks == 0)
		{
			kitch = 0;
		}
	}
	
	public int getKitch()
	{
		return kitch;
	}
}
