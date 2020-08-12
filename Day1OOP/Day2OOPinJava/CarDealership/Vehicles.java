package CarDealership;

public class Vehicles {
    private String VIN, make, model, color;
    private double wholesaleCost, retailPrice;
    private int modelYear;
    private VehicleClassification vehicleClass;

    public Vehicles(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass) {
        this.VIN = VIN;
        this.wholesaleCost = wholesaleCost;
        this.retailPrice = retailPrice;
        this.modelYear = modelYear;
        this.make = make;
        this.model = model;
        this.color = color;
        this.vehicleClass = vehicleClass;
    }

    // Getters because objects are private
    public String getVIN() {
        return VIN;
    }

    public double getWholesaleCost() {
        return wholesaleCost;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public VehicleClassification getVehicleClass() {
        return vehicleClass;
    }

    // Setters
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public void setWholesaleCost(double wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVehicleClass(VehicleClassification vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    @Override // Annotation telling us and compiler that we are Overriding previously defined
              // behavior
    public String toString() {
        return this.getModelYear() + " " + this.getMake() + " " + this.getModel();
    }
    // 2018 Kia Sorento

    public double getTargetMargin() {
        return this.retailPrice - this.wholesaleCost;
    }

    public void printVehicleType() {
        String type = "NOT SET";
        switch (this.vehicleClass) {
            case NEW:
                type = "New Car";
                break;
            case USED:
                type = "Used Car";
                break;
            case OFF_LEASE:
                type = "Leased Car";
                break;
            case SHUTTLE:
                type = "Dealer Shuttle";
                break;
            case LOANER:
                type = "Dealer Service Loaner";
                break;
            case PARTS_RUNNER:
                type = "Parts Runner";
                break;
            default:
                break;
        }
        System.out.println("The vehicle type is: " + type);
    }
}
