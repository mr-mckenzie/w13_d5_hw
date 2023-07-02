package Shop;
import ISell.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private String name;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addToStock(ISell newItem) {
        stock.add(newItem);
    }

    public void removeFromStock(ISell itemToRemove) {
        stock.remove(itemToRemove);
    }
}
