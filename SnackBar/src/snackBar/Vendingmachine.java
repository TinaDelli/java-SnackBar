package snackBar;

public class Vendingmachine
{
    private static int maxId = 0;

    public int id;
    public String name;

    public Vendingmachine(String name)
    {
        this.id = maxId ++;
        this.name = name;
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
        this.name =name; 
    }
}