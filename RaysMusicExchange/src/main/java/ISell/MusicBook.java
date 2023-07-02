package ISell;

import ISell.ISell;

public class MusicBook implements ISell {

    private String title;
    private int pages;

    private double buyingPrice;
    private double sellingPrice;

    public MusicBook(String title, int pages, double buyingPrice, double sellingPrice) {
        this.title = title;
        this.pages = pages;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public double calculateMarkUp() {
        return this.sellingPrice - this.buyingPrice;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
