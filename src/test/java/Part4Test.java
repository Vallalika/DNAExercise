import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import edu.duke.URLResource;


public class Part4Test {
    private Part4 YTtest;
    private URLResource myWebPage;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream(); // create a new output stream called outContent
    private final PrintStream originalOut = System.out; // assign standard output stream to originalOut variable

    @Before
    public void before() {
        System.setOut(new PrintStream(outContent)); // assign outContent to be tbe new output stream
        YTtest = new Part4();
        myWebPage = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
    }

    @Test
    public void canAssertOutputValue() {
        System.out.println("This line is printed");
        assertEquals("This line is printed", outContent.toString().trim());
    }

    @Test
    public void canPrintFirstYTLink() {
        String result = "http://www.YouTube.com/watch?v=sdzjcBhrgp0&feature=youtu.be";
        YTtest.findYTLinks("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        assertEquals(result, outContent.toString().substring(0,result.length()+1).trim());
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut); // reassign originalOut to output stream
    }

}