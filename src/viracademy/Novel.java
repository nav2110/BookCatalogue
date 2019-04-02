package viracademy;

public class Novel extends Book {


    /**
     * the only new @param is type (e.g. "mystery", "SF")
     */
    private String type;
    public Novel(String name, int numberOfPages, String type) {
        super(name,numberOfPages);
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
