package ch.arseekay;

public class Cake {
    private final String name;
    private final double price;

    public Cake(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Cake bakeCake () {
        return new Cake(this.name, this.price);
    }
}
