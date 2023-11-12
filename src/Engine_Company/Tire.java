package Engine_Company;
/*
* -------------------
|   <<Class>>    |
|   Tire         |
|----------------- |
| - brand : String |
| - size : int    |
|----------------- |
| + supports Car  |
|----------------- |

* */
public class Tire {
    private String brand;
    private int size;

    public Tire(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String supportForCar(Insurance suppoer) {
        return "The support for this tire is "+ suppoer.isinSured();
    }

}
