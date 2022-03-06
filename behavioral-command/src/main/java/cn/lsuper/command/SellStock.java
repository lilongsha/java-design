package cn.lsuper.command;

/**
 * @author ALGiii
 */
public class SellStock implements Order {
    private final Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        this.stock.sell();
    }
}
