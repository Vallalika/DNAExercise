public class Part1 {
    public String findSimpleGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "No start codon identified: this sample contains no DNA strand.";
        }
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        if (stopIndex == -1) {
            return "No stop codon identified: this sample contains no DNA strand.";
        }
        boolean isValidStrand = (dna.substring(startIndex, stopIndex + 3).length()) % 3 == 0;
        if (isValidStrand) {
            return dna.substring(startIndex, stopIndex + 3);
        } else {
            return "Invalid DNA sequence";
        }
    }
}
