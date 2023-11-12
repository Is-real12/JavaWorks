package Engine_Company;

/*

-------------------
        |   <<Class>>    |
        |   Dealership   |
        |----------------- |
        | - location : String |
        |----------------- |
        | + sells Car    |
        |----------------- |

*/

import java.util.ArrayList;
import java.util.Objects;

public class DealerShip {

    private final String location;
    private final ArrayList<String> carAvailable;
    private final ArrayList<String> soldCars;

    public DealerShip(String location, ArrayList<String> carAvailable, ArrayList<String> soldCars) {
        this.location = location;
        this.carAvailable = carAvailable;
        this.soldCars = soldCars;
    }

    public String getLocation() {
        return location;
    }

    public void CreateCars(String carsToCreate){
            carAvailable.add(carsToCreate);
    }

    public ArrayList<String> getCreateCars(){
        return carAvailable;
    }

    public ArrayList<String> getSoldCars(){
        return soldCars;
    }


    public void sellCars(String carsToSell ){
        for (int i = 0; i <carAvailable.size() ; i++) {
            for (int j = 0; j <i; j++) {
                if (carAvailable.get(j).equals(carsToSell)) {
                    soldCars.add(carsToSell);
                    carAvailable.remove(carsToSell);

                }
            }
        }
    }

}
