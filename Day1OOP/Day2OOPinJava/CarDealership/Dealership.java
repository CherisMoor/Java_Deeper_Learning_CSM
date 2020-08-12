package CarDealership;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Dealership {
    public static void main(String[] args) {

        /*
         * LightTruck lt = new LightTruck("234JLKD34", 48000.00, 62000.00, 2019,
         * "Chevrolet", "Silverado", "Silver", 10000L, 90000L, true,
         * VehicleClassification.NEW); if (lt.getIs4wd()) { int gears =
         * lt.xferCase.getNumGears(); System.out.println("Number of Gears: " + gears);
         * // return Number of Gears: 4 } lt.printVehicleType();
         * 
         * Leaseable lease = new Car("52430899FD", 33000.00, 42000.00, 2019,
         * "Chevrolet", "Impala", "White", VehicleClassification.NEW);
         * System.out.println("Number of months to lease: " + lease.getLeaseTerm()); //
         * return 24 months
         * 
         * // Instantiate new object for each dept ServiceDepartment sd = new
         * ServiceDepartment(); FinanceDepartment fd = new FinanceDepartment();
         * SalesDepartment sales = new SalesDepartment();
         */

        // Have Factory create new departments for us
        // Add depts to list
        List<Department> depts = new ArrayList<>();
        Department sd = DepartmentFactory.CreateDepartment(DepartmentNames.SERVICE);
        Department fd = DepartmentFactory.CreateDepartment(DepartmentNames.FINANCE);
        Department sales = DepartmentFactory.CreateDepartment(DepartmentNames.SALES);
        depts.add(sd);
        depts.add(fd);
        depts.add(sales);

        Department.printIsOpen(depts, LocalDateTime.now());

        // Won't work but an example of calling on our Factory
        Leaseable l = LeaseVehicleFactory.getLeasableVehicleByVin("234JK234");
    }
}