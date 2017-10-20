public class Main {
    public static void main(String[] args) {
        Person irek = new Person("Irek", 27, "Blue");
        Person kaska = new Person("Katarzyna", 32, "Green");
        Person pitor = new Person("Piotrek", 39, "White", 300000);

        Car car = new Car("Ford", 1200, "Focus");
        car.show();

        Car car1 = new Car("Ford", 1200, "Focus");
        car1.show();

        System.out.println(car);

        if(car.equals(car1)){
            System.out.println("Sa takie same");
        }else{
            System.out.println("nie sa");
        }
    }
}
