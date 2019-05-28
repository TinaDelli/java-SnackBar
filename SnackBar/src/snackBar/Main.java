package snackBar;

public class Main 
{
    private static void workWithSnacks()
    {
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        Vendingmachine v1 = new Vendingmachine("Food");
        Vendingmachine v2 = new Vendingmachine("Drink");
        Vendingmachine v3 = new Vendingmachine("Office");

        Snack s1 = new Snack("Chips", 1.75, v1.getId(), 36);
        Snack s2 = new Snack("Chocolate", 1.00, v1.getId(), 36);
        Snack s3 = new Snack("Pretzel", 2.00, v1.getId(), 30);

        Snack s4 = new Snack("Soda", 2.50, v2.getId(), 24);
        Snack s5 = new Snack("Water", 2.75, v2.getId(), 20);
    
        
    }

    public static void main(String[] args)
    {
        workWithSnacks();
    }
}
