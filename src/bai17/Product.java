package bai17;

public class Product {
    private String name;
    private String description;
    private double price;
    private int[] rate={1,2,3,4,5};

    public Product() {
    }

    public Product(String name, String description, double price, int[] rate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int[] getRate() {
        return rate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }

    public void setPrice(double price) {
        if ((price > 0) &&(price<=100)){
            this.price=price;
        }
    }
    public double getPrice(){
        return price;
    }
    public void viewInfo() {
        System.out.println("Ten: " + name);
        System.out.println("Gia: " + price);
        System.out.println("Danh gia: " + rate);
    }


}
