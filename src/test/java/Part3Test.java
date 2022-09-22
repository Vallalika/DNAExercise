import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Part3Test {

    Part3 testGene3;
    String stringa;
    String stringb;

    @Before
    public void before() {
        testGene3 = new Part3();
        stringa = "atg";

    }

    @Test
    public void canSpotTwoOccurrencesTrue() {
        stringb = "catgtatgtatg";
        assertTrue(testGene3.twoOccurrences(stringa,stringb));
    }

    @Test
    public void canSpotTwoOccurrencesFalse() {
        stringb = "catgtacgtattg";
        assertFalse(testGene3.twoOccurrences(stringa,stringb));
    }
}
