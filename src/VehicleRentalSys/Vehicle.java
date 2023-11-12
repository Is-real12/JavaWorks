package VehicleRentalSys;

public class Vehicle {
    private String licensePlate;
    private String model;
    private boolean available;

    public Vehicle(String licensePlate, String model){
        this.licensePlate = licensePlate;
        this.model = model;
        this.available = true;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rent(){
        available = false;
        System.out.println("you just rent "+ getModel());
    }
    public void returnVehicle(){
        System.out.println("you just return "+getModel());
    }



}
