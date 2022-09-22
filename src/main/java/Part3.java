public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb) {
        int firstOccurrenceIndex = stringb.indexOf(stringa);
        if (firstOccurrenceIndex > -1) {    // if stringa is found in stringb
            String substringToSearch = stringb.substring(firstOccurrenceIndex+stringa.length(),stringb.length());
            int secondOccurenceIndex = substringToSearch.indexOf(stringa);
            if (secondOccurenceIndex > -1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
