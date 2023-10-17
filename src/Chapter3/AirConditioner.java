package Chapter3Assignment.Driver;

public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public void setDefaultTemperature(int temperature){
        this.temperature = 16;
    }

    public int defaultTemperature() {
        return temperature;

    }


    public boolean isOn() {
        return isOn;
    }

    public boolean turnOn() {
        if (isOn) {
        }
        return true;
    }

    public boolean turnOff() {
        if (!isOn) {
        }
        return false;
    }



    public int increaseTemperature() {
        if (temperature > 16) {

        }
        return temperature + 1;

    }

    public int decreaseTemperature() {
        temperature = 30;

        if (temperature < 30) {

        }

        return temperature -1;
    }

    public int above30() {
        if (temperature > 30) {
        }
        throw new IllegalArgumentException();
    }

    public int below16() {
        if (16 < temperature) {
        }
        throw new IllegalArgumentException();
    }


    public boolean turnOn(String on) {
        return true;
    }

    public boolean turnOff(String off) {
        return false;
    }
}



