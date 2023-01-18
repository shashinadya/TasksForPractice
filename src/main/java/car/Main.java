package car;

public class Main {
    public static void main(String[] args) throws Exception {
        Car[] cars = new Car[7];
        cars[0] = new Toyota(true, "Toyota");
        cars[1] = new Mazda(false, "Mazda");
        cars[2] = new Mazda(true, "Mazda");
        cars[3] = new Toyota(false, "Toyota");
        cars[4] = new Toyota(true, "Toyota");
        cars[5] = new Mitsubishi(true, "Mitsubishi");
        cars[6] = new Mitsubishi(false, "Mitsubishi");

        carsWithFogLightsAndAWD(cars);
    }

    public static void carsWithFogLightsAndAWD(Car[] cars) {
        int countOfCars = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getIsAWD() & cars[i].turnOnFogLights()) {
                countOfCars += 1;
                System.out.println(cars[i]);
            }
        }
        System.out.println("Count of car with AWD and fog ligts is " + countOfCars);
    }
}
