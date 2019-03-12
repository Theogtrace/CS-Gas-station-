public class Item
{
    private String name;
    private double unitPrice;
    private int count;
    private double subTotal;
    public Item ( )
    {
        name = "";
        unitPrice = 0;
        count = 0;
        subTotal = unitPrice * count;
    }
    
    public Item (String nName, double nUnitPrice, int nCount)
    {
        name = nName;
        unitPrice = nUnitPrice;
        count = nCount;
        subTotal = unitPrice * count;
    }
    
    public double getUnitPrice ( )
    {
        return unitPrice;
    }
    
    public int getCount ( )
    {
        return count;
    }
    
    public String getName ( )
    {
        return name;
    }
    
    public double getSubTotal ( )
    {
        return subTotal;
    }
 
    public String toString ( )
    {
        return "\n\nname: " + name + "\nunit price: " + unitPrice
                +"\ncount: " + count + "\nsub total: " + subTotal;
                
    }
}
