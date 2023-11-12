package VehicleRentalSys;

import java.util.ArrayList;

public class Customer {
    VehicleRentalSystem vehicleRentalSystem ;
    Vehicle vehicle;
    private final String name;
    private final int id;
    private final ArrayList<Vehicle> rentedVehicle;
    private boolean isAva;
    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        this.rentedVehicle = new ArrayList<>();
        isAva = false;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void rentVehicle(Vehicle vehicle ) {
        if (vehicle.isAvailable()) {
            isAva = true;
            vehicle.rent();
            rentedVehicle.add(vehicle);
        }else {
            System.out.println("Vehicle is not available");
        }
    }
    public void returnVehicle(Vehicle vehicle){
        vehicleRentalSystem.returnVehicle();
        rentedVehicle.remove(vehicle);
    }
    public void getRentedVehicle() {
        for (Vehicle v:rentedVehicle){
            System.out.println(v);
        }
    }

    public void setVehicleRentalSystem(VehicleRentalSystem vehicleRentalSystem) {
        this.vehicleRentalSystem = vehicleRentalSystem;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setAva(boolean ava) {
        isAva = ava;
    }

    public void getRenterInfo(){
        if (isAva == true){
            System.out.println("Customer name: "+getName()+"\nId: "+getId()+
                    "\nRenters Name: "+vehicleRentalSystem.getName()+
                    "\nRentals Location: "+vehicleRentalSystem.getLocation()+
                    "\nVehicle Model: "+vehicle.getModel()+"\nVehicle License: "+vehicle.getLicensePlate());
        }
    }

}
