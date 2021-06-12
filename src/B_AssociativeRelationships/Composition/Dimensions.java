package B_AssociativeRelationships.Composition;

public class Dimensions {
    // step 19: creating fields
    private int width;
    private int height;
    private int depth;

    // step 20: create an instructor
    public Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // step 21: getters
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}

