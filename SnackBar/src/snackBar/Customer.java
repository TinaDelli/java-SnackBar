package snackBar;

public class Customer 
{

    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name)
    {
        maxId++;
        id = maxId;
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public double getCash()
    {
        return cash; 
    }
}