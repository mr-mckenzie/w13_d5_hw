import ISell.MusicBook;
import Instrument.Guitar;
import Instrument.Piano;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Guitar guitar;
    Piano piano;
    MusicBook musicBook;
    Shop shop;

    @Before
    public void before() {
        this.guitar = new Guitar(2022, "Fender", "String", "Right", "Telecaster", 120, 170);
        this.piano = new Piano(1923, "Steinway", "String", 88, 2, 18000, 35000);
        this.musicBook = new MusicBook("101 Classic Songs", 248, 15, 25);
        this.shop = new Shop("Ray's Music Exchange");
    }

    @Test
    public void hasName() {
        assertEquals("Ray's Music Exchange", this.shop.getName());
    }

    @Test
    public void canAddToStock() {
        shop.addToStock(piano);
        shop.addToStock(guitar);
        assertEquals(true, this.shop.getStock().contains(guitar));
        assertEquals(true, this.shop.getStock().contains(piano));
    }

    @Test
    public void canRemoveFromStock() {
        shop.addToStock(musicBook);
        shop.addToStock(guitar);
        assertEquals(true, this.shop.getStock().contains(musicBook));
        shop.removeFromStock(musicBook);
        shop.removeFromStock(guitar);
        assertEquals(0, this.shop.getStock().size());
    }
}
