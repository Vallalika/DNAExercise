import edu.duke.URLResource;

public class Part4 {
    public void findYTLinks(String myURL) {
        URLResource targetWebPage = new URLResource(myURL);
        for (String word: targetWebPage.words()) {
            // check if youtube.com is in the link converted to lowercase
            if (word.toLowerCase().indexOf("youtube.com") > -1) {
                int startIndex = word.indexOf("\"");
                int stopIndex = word.indexOf("\"", word.toLowerCase().indexOf("youtube.com"));
                String toPrint = word.substring(startIndex+1,stopIndex);
                System.out.println(toPrint);
            }
        }
    }
}