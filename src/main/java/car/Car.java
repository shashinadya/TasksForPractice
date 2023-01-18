package car;

public class Car {
    private boolean isAWD;
    private String modelOfCar;

    public boolean turnOnFogLights() {
        return false;
    }

    public Car(boolean isAWD, String modelOfCar) {
        this.isAWD = isAWD;
        this.modelOfCar = modelOfCar;
    }

    public Car() {
    }

    public boolean getIsAWD() {
        return isAWD;
    }

    public void setIsAWD(boolean isAWD) {
        this.isAWD = isAWD;
    }

    public String getModelOfCar() {
        return modelOfCar;
    }

    public void setModelOfCar(String modelOfCar) {
        this.modelOfCar = modelOfCar;
    }

    @Override
    public String toString() {
        return "Car [model = " + getModelOfCar() + "]";
    }
}
