public class Order
{
    private Item[ ] items;
    private int size;           //# of spaces used, num of items ordered
    private double totalPrice;
    private int capacity; //total num of spaces allocated 
    private int count;
    
    public Order ( )
    {
        capacity = 10;
        size = 0;
        items = new Item [capacity];
        totalPrice = 0;
    }
    
    public Item[ ] getItems()
    {
    	return items;
    }
    
    public int getSize ()
    {
    	return size;
    }
    
    public void addOneItem (Item newItem)
    {
        items[size++] = newItem;
        totalPrice = totalPrice + newItem.getSubTotal ( );
                
    }
    
    
    public String toString ( )
    {
        String outString = "\n\n*** order ****\n";
        for (int i = 0; i < size;i++)
            outString += items[i];
        
        outString += ("\n\n\ntotal price: " + totalPrice);
        return outString;
    }
    
    public double getTotalPrice ( )
    {
    	return totalPrice;
    }
    
    public double getCount ( )
    {
    	return count;
    }
}
 
