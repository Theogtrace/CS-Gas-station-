public class MainClass
{
	private int regular;
	private int premum;
	private int superr;
	private double totalRev;
	private int pump;
	public MainClass( )
	{
		regular = 1000;
		premum = 1000;
		superr = 1000;
		totalRev = 0;
	}

	public void updateMainClass (Order anOrder)
	{
		Item[ ] itemsBeingOrdered = anOrder.getItems ( );
		int sizeBeingOrdered = anOrder.getSize ( );
		
		for (int i = 0; i < sizeBeingOrdered; i++)
		{
			String name = itemsBeingOrdered[i].getName ( );
			int count = itemsBeingOrdered[i].getCount ( );
			if(name.equals("regular"))
			{
				regular = regular - count;
			}
			else if(name.equals("premum"))
			{
				premum = premum - count;
			}
					
			else if(name.equals("superr"))
			{
				superr = superr - count;
			}
					
			totalRev = totalRev + anOrder.getTotalPrice ( );
			System.out.println ("Total amount of regular gas left = " + regular);
			System.out.println ("Total amount of premum gas left = " + premum);
			System.out.println ("Total amount of superr left = " + superr);
			System.out.println ("Total revenue for the day = " + totalRev);
		}
		
	}
	
	public void MainClassAvilable ()
	{
		if(regular > 0 || premum > 0 || superr >0)
		{
			pump = 1;
		}
		if (regular == 0 || premum == 0 || superr == 0)
		{
			pump = 0;
		}
	}
	
	public int getPump()
	{
		return pump;
	}
}
