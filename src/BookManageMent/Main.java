package BookManageMent;

import VehicleRentalSys.Customer;
import VehicleRentalSys.Vehicle;
import VehicleRentalSys.VehicleRentalSystem;

public class Main {
    public static void main(String[] args) {


//        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem("OLA OF LAGOS", "Abuja");
        Vehicle vehicle = new Vehicle("kl543", "Azul");
        Vehicle vehicle1 = new Vehicle("ab65423", "Aceil");
        Customer customer = new Customer("Israel", 12432);
        customer.rentVehicle(vehicle);
        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem("OLA OF LAGOS", "Abuja");

        customer.getRentedVehicle();

    }
}