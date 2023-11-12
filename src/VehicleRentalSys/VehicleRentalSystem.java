package VehicleRentalSys;

public class VehicleRentalSystem {
    private final String name;
    private final String location;
    Vehicle vehicle;
    public VehicleRentalSystem(String name, String location){
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void rentVehicle(){
        if (vehicle.isAvailable()) {
            vehicle.rent();
        }
    }

    public void returnVehicle(){
        vehicle.returnVehicle();
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
