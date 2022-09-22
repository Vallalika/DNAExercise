import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Part2Test {

    private Part2 testGene2;
    private String startCodon;
    private String stopCodon;

    @Before
    public void before() {
        testGene2 = new Part2();
        startCodon = "ATG";
        stopCodon = "TAA";
    }

    @Test
    public void canFindValidGene() {
        String validString = "ATGGGGGTTACCAATTAA";
        assertEquals("ATGGGGGTTACCAATTAA",testGene2.findSimpleGene(validString,startCodon,stopCodon));
    }

    @Test
    public void findsNoGeneIfNoStartCodon() {
        String noStartCodon = "ATCGGGGTTACCAATAA";
        String noStartOrStopCodon = "ATCGGGGTTACCAATAC";
        assertEquals("No start codon identified: this sample contains no DNA strand.",testGene2.findSimpleGene(noStartCodon,startCodon,stopCodon));
        assertEquals("No start codon identified: this sample contains no DNA strand.",testGene2.findSimpleGene(noStartOrStopCodon,startCodon,stopCodon));
    }

    @Test
    public void findsNoGeneIfNoStopCodon() {
        String noStopCodon = "ATGGGGGTTACCAATAC";
        assertEquals("No stop codon identified: this sample contains no DNA strand.",testGene2.findSimpleGene(noStopCodon,startCodon,stopCodon));
    }

    @Test
    public void findsNoGeneIfStrandNotMultipleOfThree() {
        String noMultipleOfThree = "ATGGGGGTTACCAATAA";
        assertEquals("Invalid DNA sequence",testGene2.findSimpleGene(noMultipleOfThree,startCodon,stopCodon));
    }

    @Test
    public void returnsUpperCaseWhenGivenUpperCase() {
        String validStringUpperCase = "ATGGGGGTTACCAATTAA";
        assertEquals("ATGGGGGTTACCAATTAA", testGene2.findSimpleGene(validStringUpperCase,startCodon,stopCodon));
    }

    @Test
    public void returnsLowerCaseWhenGivenLowerCase() {
        String validStringLowerCase = "atgggggttaccaattaa";
        assertEquals("atgggggttaccaattaa", testGene2.findSimpleGene(validStringLowerCase,startCodon,stopCodon));
    }
}
