package bai17;


public class Product {
    String name;
    String description;
    double price;
    int[] rate = {1, 2, 3, 4, 5};

    public Product() {
    }

    public Product(String name, String description, double price, int[] rate) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.rate = rate;
    }

    public void setRate(int[] rate) {
        this.rate = rate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int[] getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public void viewInfo() {
        System.out.println("Ten: " + name);
        System.out.println("Gia: " + price);
        System.out.println("Mo ta: " + description);
    }
}


