import Instrument.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void before() {
        this.piano = new Piano(1998, "Yamaha", "String", 88, 3, 1200, 1900);
    }

    @Test
    public void hasKeys() {
        assertEquals(88, this.piano.getKeys());
    }

    @Test
    public void hasPedals() {
        assertEquals(3, this.piano.getNumberOfPedals());
    }

    @Test
    public void canPlay() {
        assertEquals("Plinkity Plonk!", this.piano.play());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(1200, this.piano.getBuyingPrice(), 0);
    }
    @Test
    public void hasSellingPrice() {
        assertEquals(1900, this.piano.getSellingPrice(), 0);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(700, this.piano.calculateMarkUp(), 0);
    }
}
