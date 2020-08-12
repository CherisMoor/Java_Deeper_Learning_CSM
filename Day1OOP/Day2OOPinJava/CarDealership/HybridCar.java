package CarDealership;

//    Vehicle
//       |      |      |
//       |      |      |
//      Car   Truck   SUV
//       |
//       |
//   HybridCar

public class HybridCar extends Car {
    private int batteryLife, MPG;
    private String chargerType;

    public HybridCar(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, int batteryLife, int MPG, String chargerType, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.batteryLife = batteryLife;
        this.MPG = MPG;
        this.chargerType = chargerType;
    }

    // Getters
    public int getBatteryLife() {
        return this.batteryLife;
    }

    public int getMpg() {
        return this.MPG;
    }

    public String getChargerType() {
        return this.chargerType;
    }

    // Setters
    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public void setMpg(int MPG) {
        this.MPG = MPG;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }
}