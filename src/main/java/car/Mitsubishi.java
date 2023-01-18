package car;

public class Mitsubishi extends Car {

    public Mitsubishi(boolean isAWD, String modelOfCar) {
        super(isAWD, modelOfCar);
    }

    @Override
    public boolean turnOnFogLights() {
        return true;
    }
}
