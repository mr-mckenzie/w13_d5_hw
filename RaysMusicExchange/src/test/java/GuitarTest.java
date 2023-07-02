import Instrument.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void before() {
        this.guitar = new Guitar(1973, "Gibson", "String", "Left", "SG", 1950, 2500);
    }

    @Test
    public void guitarHasYearOfManufacture() {
        assertEquals(1973, this.guitar.getYearOfManufacture());
    }

    @Test
    public void guitarHasManufacturer() {
        assertEquals("Gibson", this.guitar.getManufacturer());
    }

    @Test
    public void guitarHasMusicalFamily() {
        assertEquals("String", this.guitar.getMusicalFamily());
    }

    @Test
    public void guitarHasHandedness() {
        assertEquals("Left", this.guitar.getHandedness());
    }

    @Test
    public void guitarHasModel() {
        assertEquals("SG", this.guitar.getModel());
    }

    @Test
    public void guitarCanPlay() {
        assertEquals("Twang!", this.guitar.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(1950, this.guitar.getBuyingPrice(), 0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(2500, this.guitar.getSellingPrice(), 0);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(550, this.guitar.calculateMarkUp(), 0);
    }

}
