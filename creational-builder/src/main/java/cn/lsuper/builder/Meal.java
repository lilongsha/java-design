package cn.lsuper.builder;

import java.util.ArrayList;

/**
 * @author ALGiii
 */
public class Meal {
    private final ArrayList<Item> items = new ArrayList<>();
    private float cost = 0f;

    void addItem(Item item) {
        items.add(item);
    }

    float getCost() {
        items.forEach(item -> cost += item.price());
        return cost;
    }

    void showItems() {
        items.forEach(item -> {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        });
    }
}
