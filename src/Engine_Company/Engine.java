package Engine_Company;
/*
-------------------
|   <<Class>>    |
|   Engine       |
|----------------- |
| - fuelType : String |
|----------------- |
| + start()       |
| + stop()        |
|----------------- |
| + powers Car    |
|----------------- |
*/
public class Engine {
    private String fuelType;

    public Engine(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getStartoRsTOP(boolean mooving){
        return mooving ? "Car Is Moving" : "Car has Stop";
    }

    public boolean powerCar(){
        boolean isTrue = false;
        if (Integer.parseInt(fuelType) > 0){

            return isTrue;
        }
        return isTrue;
    }

}
