package Instrument;

public abstract class Instrument implements IPlay {

    int yearOfManufacture;
    String manufacturer;
    String musicalFamily;

    public Instrument (int yearOfManufacture, String manufacturer, String musicalFamily) {
        this.yearOfManufacture = yearOfManufacture;
        this.manufacturer = manufacturer;
        this.musicalFamily = musicalFamily;
    }

    public abstract String play();

    public int getYearOfManufacture() {
        return this.yearOfManufacture;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getMusicalFamily() {
        return this.musicalFamily;
    }
}
