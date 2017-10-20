public class Car {
    private String brand;
    private int price;
    private String model;

    public Car(String brand, int price, String model) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void show(){
        System.out.println(price + " : " + brand);
    }
}
