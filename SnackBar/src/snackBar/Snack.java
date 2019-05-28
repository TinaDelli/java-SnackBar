package snackBar;

public class Snack {
    
    private static int maxId = 0;
    private int id; 
    private String name;
    private double cost;
    private int vendingMachineID;
    private int quantity; 

    public Snack(String name, double cost, int vendingMachineID, int quantity)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cost = cost;
        this.vendingMachineID = vendingMachineID;
        this.quantity = quantity;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name= name;
    }
    public double getCost()
    {
        return cost;
    }
    public void setCost(int cost)
    {
        this.cost= cost;
    }

    public int getVendingMachineID()
    {
        return vendingMachineID;
    }
    public void setVendingMachineID(int vendingMachineID)
    {
        this.vendingMachineID = vendingMachineID;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        String rtnStr= "id: " + id + "\n" +
                        "name: " + name + "\n" +
                        "cost: " + cost + "\n" +
                        "vendingMachineID: " + vendingMachineID + "\n" +
                        "quantity: " + quantity + "\n";

        return rtnStr; 
    }
}