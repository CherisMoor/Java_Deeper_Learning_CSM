package CarDealership;

// interfaces normally follow a naming convention similar to classes but they end in '-ible' or '-able' 
//Usually adjective because we use interfaces to provide additional capabilities
interface Leaseable {
    boolean isLeasable();

    int getLeaseTerm();

    int getMaxMilesPerYear();

    // If default, no classes implementing the interface has to modified because it
    // becomes default
    default float getMileablePenalty() {
        return 500.0f;
    }
}