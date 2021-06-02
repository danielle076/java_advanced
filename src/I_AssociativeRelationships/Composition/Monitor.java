package I_AssociativeRelationships.Composition;

public class Monitor {
    // step 6: creating fields
    private String model;
    private String manufacturer;
    private int size;
    // step 10 explanation
    // the resolution class is part of a monitor, but the monitor isn't a resolution, it has a resolution
    // this is what composition is: we're saying that the resolution is a component of a monitor
    // the monitor has a resolution, which is the native resolution
    private Resolution nativeResolution; // this is a class: step 10

    // step 7: create an instructor
    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    // step 8: method called drawPixelAt
    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }

    // step 9: getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
