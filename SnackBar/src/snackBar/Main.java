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
        
        System.out.println("*** Purchase Transactions ***");
        System.out.println(c1.getName() + " buys " + 3 + " of " + s4.getName() + "s");
        c1.spendCash(c1.getCash(), (s4.getCost() * 3));
        System.out.println(c1.getName() + "'s new cash on hand: " + c1.getCash());
        s4.buySnack(s4.getQuantity(), 3);
        System.out.println("Quantity of " + s4.getName() + ": " + s4.getQuantity());
        System.out.println();

        System.out.println(c1.getName() + " buys " + 1 + " of " + s3.getName());
        c1.spendCash(c1.getCash(), s3.getCost());
        System.out.println(c1.getName() + "'s new cash on hand: $" + c1.getCash());
        s3.buySnack(s3.getQuantity(), 1);
        System.out.println("Quantity of " + s3.getName() + ": " + s3.getQuantity());
        System.out.println();

        System.out.println(c2.getName() + " buys " + 2 + " of " + s4.getName() + "s");
        c2.spendCash(c2.getCash(), (s4.getCost() * 2));
        System.out.println(c2.getName() + "'s new cash on hand: $" + c2.getCash());
        s4.buySnack(s4.getQuantity(), 2);
        System.out.println("Quantity of " + s4.getName() + ": " + s4.getQuantity());
        System.out.println();

        System.out.println(c1.getName() + " just found $10!!!!! Be jealous!");
        c1.addCash(c1.getCash(), 10.00);
        System.out.println(c1.getName() + " now has $" + c1.getCash());
        System.out.println();

        System.out.println(c1.getName() + " bought " + 1 + " of " + s2.getName());
        c1.spendCash(c1.getCash(), s2.getCost());
        System.out.println(c1.getName() + "'s new cash on hand: $" + c1.getCash());
        s2.buySnack(s2.getQuantity(), 1);
        System.out.println("Quantity of " + s2.getName() + ": " + s2.getQuantity());
        System.out.println();

        System.out.println(s3.getName() + " Just got restocked! ");
        s3.addQuantity(s3.getQuantity(), 12);
        System.out.println(s3.getName() + " Now has " + s3.getQuantity() + " in stock ");
        System.out.println();

        System.out.println(c2.getName() + " buys " + 3 + " of " + s3.getName());
        c2.spendCash(c2.getCash(), (s3.getCost() * 3));
        System.out.println(c2.getName() + " Now has $ " + c2.getCash() + " left");
        s3.buySnack(s3.getQuantity(), 3);
        System.out.println(s3.getName() + " has " + s3.getQuantity() + " in stock now");

    }

    public static void main(String[] args)
    {
        workWithSnacks();
    }
}