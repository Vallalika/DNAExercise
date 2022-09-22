public class Part2 {

    public String findSimpleGene(String dna, String startCodon, String stopCodon) {

        if (dna.equals(dna.toUpperCase())) {
            startCodon = startCodon.toUpperCase();
            stopCodon = stopCodon.toUpperCase();
        }

        if (dna.equals(dna.toLowerCase())) {
            startCodon = startCodon.toLowerCase();
            stopCodon = stopCodon.toLowerCase();
        }

        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1) {
            return "No start codon identified: this sample contains no DNA strand.";
        }
        int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
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