package Composition;

public class Resolution {
    // step 11: creating fields
    private int width;
    private int height;

    // step 12: create an instructor
    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // step 13: getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
