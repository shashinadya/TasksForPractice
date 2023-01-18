package car;

public class Toyota extends Car {
    public Toyota(boolean isAWD, String modelOfCar) {
        super(isAWD, modelOfCar);
    }

    @Override
    public boolean turnOnFogLights() {
        return true;
    }
}
