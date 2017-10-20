public class Main {
    public static void main(String[] args) {
        Person irek = new Person("Irek", 27, "Blue");
        Person kaska = new Person("Katarzyna", 32, "Green");
        Person pitor = new Person("Piotrek", 39, "White", 300000);

        Car car = new Car("Ford", 1200, "Focus");
        car.show();

        Car car1 = new Car("Nissan", 110000, "Qasqaui");
        car1.setPrice(50000);
        car1.show();
    }
}
