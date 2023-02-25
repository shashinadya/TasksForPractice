package phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89031084079", "Samsung Galaxy S21", 14.03);
        Phone phone2 = new Phone("89151152233", "Samsung M32", 12.02);
        Phone phone3 = new Phone("89043455432", "Apple iPhone 13 Pro", 32.02);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Nadya");
        phone1.getNumber(phone1);
        phone2.receiveCall("Sasha");
        phone2.getNumber(phone2);
        phone3.receiveCall("Ivan");
        phone3.getNumber(phone3);
        phone1.receiveCall("Vasya", "890767876567");
        phone1.sendMessage("547367673", "357673", "3576573");
    }
}
