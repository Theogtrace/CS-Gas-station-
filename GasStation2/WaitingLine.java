//WaitingLine: array of waiting clients

public class WaitingLine 
{
	private Client[ ] clients;
    private int capacity;
    private int numOfWaitingClients;
    
    public WaitingLine ( )
    {
        capacity = 100;
        clients = new Client [capacity];
        for(int i = 0; i < capacity; i++) //creates array of clients
	   		clients[i] = new Client();
        
        numOfWaitingClients = 0;
    }
    
    public void addAClient(Client aClient)
    {
    	clients[numOfWaitingClients] = aClient;
    	numOfWaitingClients++;
    }
    
    public int getNumOfWaitingClients()
    {
    	return numOfWaitingClients;
    }
    
    public Client getNextClientFromLine()
    {
    	Client nextClientInLine = clients[0];
           if (numOfWaitingClients > 1)
           {
               for (int i = 0; i < numOfWaitingClients-1; i++)
                   clients[i] = clients[i+1];
               
           }
         numOfWaitingClients--;
         return nextClientInLine;
    }
    
    public String toString()
    {
    	String que = "\nWaiting Customers: ";
    	for(int i = 0; i < numOfWaitingClients; i++)
    	{
    		que += "[" + clients[i].getTag() + "], ";
    	}
    	
    	return que;
    }
    
}
