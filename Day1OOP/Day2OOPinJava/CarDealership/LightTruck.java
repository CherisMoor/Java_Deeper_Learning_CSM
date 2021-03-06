package CarDealership;

public class LightTruck extends Vehicles {

    private long towingCapacity;
    private long truckWeight;
    private boolean is4wd;
    private long grossCombinedWeight;

    public LightTruck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,
            String color, long towingCapacity, long truckWeight, boolean is4wd, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.towingCapacity = towingCapacity;
        this.truckWeight = truckWeight;
        this.is4wd = is4wd;
        this.grossCombinedWeight = this.towingCapacity + this.truckWeight;

        if (this.is4wd == true) {
            this.xferCase = new TransferCase();
        }
    }

    public long getTowingCapacity() {
        return this.towingCapacity;
    }

    public long getTruckWeight() {
        return this.truckWeight;
    }

    public long getGrossCombinedWeight() {
        return this.grossCombinedWeight;
    }

    public boolean getIs4wd() {
        return this.is4wd;
    }

    public void setTowingCapacity(long towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public void setTruckWeight(long weight) {
        this.truckWeight = weight;
    }

    public void setGrossCombinedWeight(long weight) {
        this.grossCombinedWeight = weight;
    }

    public void setGrossCombinedWeight() {
        this.grossCombinedWeight = this.truckWeight + this.towingCapacity;
    }

    public void setIs4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }

    @Override
    public String toString() {
        String str = super.toString();

        if (is4wd) {
            str += ", (4 WD)";
        }
        return str;
    }

    public class TransferCase {
        private int numGears;

        public TransferCase() {
            this.numGears = 4;
        }

        public TransferCase(int gears) {
            this.numGears = gears;
        }

        public int getNumGears() {
            return this.numGears;
        }
    }

    public TransferCase xferCase;

}