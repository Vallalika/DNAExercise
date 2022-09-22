public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb) {
        int firstOccurrenceIndex = stringb.indexOf(stringa);
        if (firstOccurrenceIndex > -1) {    // if stringa is found in stringb
            String substringToSearch = stringb.substring(firstOccurrenceIndex + stringa.length(), stringb.length());
            int secondOccurenceIndex = substringToSearch.indexOf(stringa);
            if (secondOccurenceIndex > -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String lastPart(String stringa, String stringb) {
        int stringaIndex = stringb.indexOf(stringa);
        if (stringaIndex > -1) { // if stringa is in string b
            return stringb.substring(stringaIndex+stringa.length(),stringb.length());
        } else {
            return stringb;
        }
    }
}
