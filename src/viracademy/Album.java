package viracademy;

public class Album extends Book {
    /**
     * the only new @param is quality (e.g. "high", "medium", "low")
     */
    private String quality;

    public Album(String name, int numberOfPages, String quality) {
        super(name, numberOfPages);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }
}
