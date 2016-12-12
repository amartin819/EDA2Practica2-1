package material.utils;

/**
 *
 * @author jvelez
 */
public class Index {
    
    /**
     * Load the test contained in the file.
     * @param filename Name of the file.
     * @param stopwords Name of the stopwords file.
     */
    public void load(String filename, String stopwords) {
        throw new RuntimeException("Implements this method.");
    }

    /**
     * 
     * @return a String with the occurrences of the words with uppercase 
     * in the text at its pages out of the stopword list.
     */
    public String allOccurrencesIndex() {
        throw new RuntimeException("Implements this method.");
    }

    /**
     * 
     * @return a String with the page of the first occurrence of each word 
     * with uppercase in the text out of the stopword list.
     */
    public String firstOccurrencesIndex() {
        throw new RuntimeException("Implements this method.");
    }
}
