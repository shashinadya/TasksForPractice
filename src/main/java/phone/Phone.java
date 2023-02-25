package phone;

import java.util.Arrays;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
    }

    public void sendMessage(String... phoneNumbers) {
            System.out.println(Arrays.toString(phoneNumbers));
    }

    public String getNumber(Phone phone) {
        System.out.println(number);
        return number;
    }
    @Override
    public String toString() {
        return "Phone [number = " + number
                + " , model = " + model
                + " , weight = " + weight + "]";
    }

    public void sendMessage(Number[] numbers) {

    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
