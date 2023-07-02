import ISell.MusicBook;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicBookTest {

    public MusicBook musicBook;

    @Before
    public void before() {
        this.musicBook = new MusicBook("Christmas Tunes", 24, 4.50, 9.99);
    }

    @Test
    public void hasTitle() {
        assertEquals("Christmas Tunes", this.musicBook.getTitle());
    }

    @Test
    public void hasPages() {
        assertEquals(24, this.musicBook.getPages());
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(4.5, this.musicBook.getBuyingPrice(), 0);
    }

    @Test
    public void hasSellingPrice() {
        assertEquals(9.99, this.musicBook.getSellingPrice(), 0);
    }

    @Test
    public void canCalculateMarkUp() {
        assertEquals(5.49, this.musicBook.calculateMarkUp(), 0);
    }
}
