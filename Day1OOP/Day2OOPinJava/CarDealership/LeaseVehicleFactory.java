package CarDealership;

public class LeaseVehicleFactory {
    public static Leaseable getLeasableVehicleByVin(String VIN) {
        Leaseable leasable = null;

        // These methods called haven't been created, using as an example

        String vehicleType = decodeVinForType(VIN);

        if (vehicleType.equals("Car")) {
            leasable = getCarDetails(VIN);
        } else if (vehicleType.equals("LightTruck")) {
            leasable = getTruckDetails(VIN);
        }
        return leasable;
    }
}