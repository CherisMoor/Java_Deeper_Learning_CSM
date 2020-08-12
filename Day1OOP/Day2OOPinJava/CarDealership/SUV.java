package CarDealership;

public class SUV extends Vehicles {
    // Simple SUV constructor inheriting all of the methods and properties of
    // Vehicle
    public SUV(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }
}