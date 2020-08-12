package CarDealership;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ServiceDepartment extends Department {
    // Constructor with deptName and numEmployees given
    public ServiceDepartment() {
        super("Service", 20);
    }

    // Create "association" between Vehicle and ServiceDepartment
    // Very loose, lifetime of obj are independent of one another
    public boolean changeEngineOil(Vehicles v) {
        // Because ServiceDepartment doesn't "own" the lifetime of the obj its good
        // practice to ensure a valid obj has been passed in
        if (v != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isOpenToday(LocalDateTime day) {
        // Closed on Sunday so isOpenToday returns false for Sundays
        if (day.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            return false;
        } else {
            return true;
        }
    }

}