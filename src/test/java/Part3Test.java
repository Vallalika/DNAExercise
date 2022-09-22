import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Part3Test {

    Part3 testGene3;
    String stringa;

    @Before
    public void before() {
        testGene3 = new Part3();
        stringa = "atg";

    }

    @Test
    public void canSpotTwoOccurrencesTrue() {
        String stringb = "catgtatgtatg";
        assertTrue(testGene3.twoOccurrences(stringa,stringb));
    }

    @Test
    public void canSpotTwoOccurrencesFalse() {
        String stringb = "catgtacgtattg";
        assertFalse(testGene3.twoOccurrences(stringa,stringb));
    }

    @Test
    public void canFindSubstringaAndReturnRestOfStringb() {
        String stringb = "catgtatgtatg";
        assertEquals("tatgtatg",testGene3.lastPart(stringa,stringb));
    }

    @Test
    public void canReturnStringbIfStringaNotFound() {
        String stringb = "catttatctata";
        assertEquals("catttatctata",testGene3.lastPart(stringa,stringb));
    }
}
