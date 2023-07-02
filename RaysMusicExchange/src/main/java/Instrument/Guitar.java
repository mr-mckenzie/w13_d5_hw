package Instrument;
import ISell.ISell;

public class Guitar extends Instrument implements ISell{

    private String model;
    private String handedness;
    private double buyingPrice;
    private double sellingPrice;

    public Guitar (int yearOfManufacture, String manufacturer, String musicalFamily, String handedness, String model, double buyingPrice, double sellingPrice) {
        super(yearOfManufacture, manufacturer, musicalFamily);
        this.handedness = handedness;
        this.model = model;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public String play() {
        return "Twang!";
    }

    public String getHandedness() {
        return this.handedness;
    }

    public String getModel() {
        return this.model;
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
