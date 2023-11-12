package Engine_Company;

import java.util.ArrayList;

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
public class Test {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();
        ArrayList<String> soldCars = new ArrayList<>();

        DealerShip dealerShip = new DealerShip("Ikorodu", li, soldCars);
        dealerShip.CreateCars("Siena 2007");
        dealerShip.CreateCars("Siena");
       dealerShip.sellCars("Siena 2007");
        System.out.println(dealerShip.getCreateCars());

     Insurance insurance = new Insurance(1049);

    }
}