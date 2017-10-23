package task5;

public class MyWater {
    private static float smallBottle = 0.5f;
    private static float midBottle = 1f;
    private static float bigBottle = 2f;

    private int smallBottleCount;
    private int bigBottleCount;
    private int midBottleCount;

    public MyWater() {
        this.smallBottleCount = 0;
        this.bigBottleCount = 0;
        this.midBottleCount = 0;
    }

    public void addSmallBottle(int howMany){
        smallBottleCount += howMany;
    }

    public void addMidBottle(int howMany){
        midBottleCount += howMany;
    }
    public void addBigBottle(int howMany){
        bigBottleCount += howMany;
    }

    private float countWater() {
        return smallBottle * smallBottleCount +
                midBottle * midBottleCount +
                bigBottle * bigBottleCount;
    }

    public void printStatus() {
        System.out.println("Mam " + countWater() + " L. wody");
        System.out.println("Duzych butelek: " + bigBottleCount);
        System.out.println("Srednich butelek: " + midBottleCount);
        System.out.println("Malych butelek: " + smallBottleCount);
    }

    public static float getSmallBottle() {
        return smallBottle;
    }

    public static void setSmallBottle(float smallBottle) {
        MyWater.smallBottle = smallBottle;
    }

    public static float getMidBottle() {
        return midBottle;
    }

    public static void setMidBottle(float midBottle) {
        MyWater.midBottle = midBottle;
    }

    public static float getBigBottle() {
        return bigBottle;
    }

    public static void setBigBottle(float bigBottle) {
        MyWater.bigBottle = bigBottle;
    }
}
