import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Part1Test {

    private Part1 testGene;

    @Before
    public void before() {
        testGene = new Part1();
    }

    @Test
    public void canFindValidGene() {
        String validString = "ATGGGGGTTACCAATTAA";
        assertEquals("ATGGGGGTTACCAATTAA",testGene.findSimpleGene(validString));
    }

    @Test
    public void findsNoGeneIfNoStartCodon() {
        String noStartCodon = "ATCGGGGTTACCAATAA";
        String noStartOrStopCodon = "ATCGGGGTTACCAATAC";
        assertEquals("No start codon identified: this sample contains no DNA strand.",testGene.findSimpleGene(noStartCodon));
        assertEquals("No start codon identified: this sample contains no DNA strand.",testGene.findSimpleGene(noStartOrStopCodon));
    }

    @Test
    public void findsNoGeneIfNoStopCodon() {
        String noStopCodon = "ATGGGGGTTACCAATAC";
        assertEquals("No stop codon identified: this sample contains no DNA strand.",testGene.findSimpleGene(noStopCodon));
    }

    @Test
    public void findsNoGeneIfStrandNotMultipleOfThree() {
        String noMultipleOfThree = "ATGGGGGTTACCAATAA";
        assertEquals("Invalid DNA sequence",testGene.findSimpleGene(noMultipleOfThree));
    }

}
