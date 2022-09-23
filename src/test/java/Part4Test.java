import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import edu.duke.URLResource;


public class Part4Test {
    private Part4 YTtest;
    private URLResource myWebPage;

    @Before
    public void before() {
        YTtest = new Part4();
        myWebPage = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
    }

    @Test
    public void canPrintFirstYTLink() {
        assertEquals("https://www.youtube.com/watch?v=sdzjcBhrgp0",YTtest.findYTLinks());
    }
}
