package I_Composition;

public class Case {
    // step 14: creating fields
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions; // this is a class: step 18

    // step 15: create an instructor
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    // step 16: method called pressPowerButton
    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    // step 17: getters
    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
