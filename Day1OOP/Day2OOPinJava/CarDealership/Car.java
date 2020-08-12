package CarDealership;

//Convention dictates that "implements" comes after extends if it is present 
public class Car extends Vehicles implements Leaseable, Discountable {
    // Simple Car constructor inheriting all of the methods and properties of
    // Vehicle
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }

    @Override
    public double getTargetMargin() {
        return super.getTargetMargin() - 1000;
        // super is kind of like 'this' and getTargetMargin() is already defined in
        // Vehicles Class(Parent)

        // Long way to do it ===== this.getRetailPrice() - this.getWholesaleCost() -
        // 1000;
    }
    // For example showing profit if there is a $1000 rebate with purchase of car

    // Implementing methods for ILeaseable
    @Override
    public boolean isLeasable() {
        return true;
    }

    public int getLeaseTerm() {
        return 24;
    }

    public int getMaxMilesPerYear() {
        return 15_000;
    }

    // Implementing methods from IDiscountable
    @Override
    public float getMaximumDiscountPct() {
        return 18.5f;
    }

    public float getPersonDiscount() {
        return 12.5f;
    }

    public float getCorporateDiscount() {
        return 20.0f;
    }
}