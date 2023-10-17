package Chapter3Assignment.Driver;

public class Okada {
    private boolean isOn;
    private int speed;
    private int gear;

    public Okada() {
        this.isOn = false;
        this.gear = 0;
        this.speed = 0;
    }
        public boolean getIsOn(){
            return isOn;

        }

        public void turnOn(){
        isOn = true;
        }
    public void turnOff(){
        isOn = true;
    }

    public int speed(){
        return  speed;
    }

    public int gear(){
        return gear;
    }

    public void acceleration() {
        if (isOn) {
            if (gear == 1)
                speed += 1;

            else if (gear == 2)
                speed += 2;

            else if (gear == 3)
                speed += 3;

            else if (gear == 4)
                speed += 4;
        }
    }


    public void deceleration(){
        if (isOn) {
            if (gear == 1)
                speed = (speed - 1);

            else if (gear == 2)
                speed = (speed - 1);

            else if (gear == 3)
                speed = (speed - 1);

            else if (gear == 4)
                speed = (speed - 1);
        }
    }

    public void adjustGear (){
        if (gear < 20 )
            gear = 1;

        if (gear < 20 )
        gear = 2;

    }

    }







