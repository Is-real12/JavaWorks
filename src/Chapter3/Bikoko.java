package Chapter3Assignment.Driver;

public class Bikoko {
    private boolean isOn;
    private int accelerate;
    private int decelerate;
    private int gear;


    public void isOn() {
        if (isOn = false || true) {
            isOn = true;

        } else
            isOn = false;


    }

    public boolean turnOn() {
        return isOn = true;
    }

    public boolean getTurnOff() {
        return isOn = false;

    }


    public int accelerate(int accelerate) {
        this.gear = 1;
        if (accelerate == 1) {
            return accelerate += gear;
        }
        this.gear = 2;
        if (accelerate == 2) {
            return accelerate += gear;
        }
        this.gear = 3;
        if (accelerate == 3) {
            return accelerate += gear;
        }
        this.gear = 4;
        if (accelerate == 4) {
            return accelerate += gear;
        }
        return accelerate;


    }



    public int getGear (){
        for (gear = gear;  gear < 40; gear++) {
            return gear;
        }

        return gear;
    }

    public int decelerate(int decelerate) {
       this.getGear();
        if (decelerate == -1) {
            return decelerate - getGear();
        }
        this.getGear();
        if (decelerate == -2) {
            return decelerate - getGear();
        }
        this.getGear();
        if (decelerate == -3) {
            return decelerate - getGear();
        }
        this.getGear();
        if (decelerate == -4) {
            return decelerate - getGear();
        }
        return getGear();
    }
}