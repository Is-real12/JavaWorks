package ModaPac.MyumlPractice.car;

public class Car {
    private String make;
    private String model;

    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }

    public void setMake(String make){
        this.make = make;
    }

    public String getMake(){
        return make;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public boolean getStart(){
        return true;
    }
    public boolean getStop(){
        return false;
    }
    public String hasEngine(boolean t){
        return t ? "It has engine " : "No engine";
    }

    public void getInfo(boolean engine_Status){
        System.out.println("Model: "+getModel()+"\n"+ "Make: "+ getMake()+"\n"+"Starting: "+getStart()+"\n"+"Does it Have Engine: "+hasEngine(engine_Status));
    }
}
