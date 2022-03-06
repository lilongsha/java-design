package cn.lsuper.command;

/**
 * @author ALGiii
 */
public class Stock {
    private final String name;
    private final Integer quantity;

    public Stock(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void buy() {
        System.out.printf("Stock [ Name: %s, Quantity: %d ] bought%n", name, quantity);
    }

    public void sell() {
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }
}
