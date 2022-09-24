import edu.duke.URLResource;

public class Part4 {
    public void findYTLinks() {
        URLResource targetWebPage = new URLResource("https://www.dukelearntoprogram.com//course2/data/manylinks.html");
        for (String word: targetWebPage.words()) {
            // check if youtube.com is in the link converted to lowercase
            if (word.toLowerCase().indexOf("youtube.com") > -1) {
                int startIndex = word.indexOf("\"");
                int stopIndex = word.lastIndexOf("\"");
                String toPrint = word.substring(startIndex+1,stopIndex+1);
                System.out.println(toPrint);
            }
        }
    }
}