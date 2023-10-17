//public class AirConditioner {
//
//    private String productName;
//    private int temperature;
//    private boolean isOn;
//
//    public AirConditioner(String productName, int temperature, boolean isOn) {
//        this.productName = productName;
//        this.temperature = temperature;
//        this.isOn = isOn;
//    }
//
//    public void decreaseTemperature() {
//        if (isOn && temperature > 16) {
//            temperature--;
//        }
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public int getTemperature() {
//        return temperature;
//    }
//
//    public void increaseTemperature() {
//        if (isOn && temperature < 30) {
//            temperature++;
//        }
//    }
//
//    public boolean isOn() {
//        return isOn;
//    }
//
//    public void setOn(boolean on) {
//        isOn = on;
//    }
//
//    public void setProductName(String newName) {
//        productName = newName;
//    }
//
//    public void setTemperature(int newTemperature) {
//        if (newTemperature >= 16 && newTemperature <= 30) {
//            temperature = newTemperature;
//        }
//    }
//}