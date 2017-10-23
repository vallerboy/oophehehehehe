package task5;

public class Main {
    public static void main(String[] args) {
        MyWater myWater = new MyWater();

        myWater.addBigBottle(5);
        myWater.addSmallBottle(2);
        myWater.addMidBottle(1);

        myWater.printStatus();

        myWater.addMidBottle(10);
        myWater.addBigBottle(1);
        myWater.addSmallBottle(2);
        myWater.addBigBottle(40);

        myWater.printStatus();
    }
}
