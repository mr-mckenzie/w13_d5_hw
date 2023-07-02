package Instrument;
import ISell.ISell;

public class Piano extends Instrument implements ISell {

    private int keys;
    private int numberOfPedals;
    private double buyingPrice;
    private double sellingPrice;


    public Piano(int yearOfManufacture, String manufacturer, String musicalFamily, int keys, int numberOfPedals, double buyingPrice, double sellingPrice) {
        super(yearOfManufacture, manufacturer, musicalFamily);
        this.keys = keys;
        this.numberOfPedals = numberOfPedals;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String play() {
        return "Plinkity Plonk!";
    }

    public int getKeys() {
        return keys;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double calculateMarkUp() {
        return this.sellingPrice - this.buyingPrice;
    }
}
