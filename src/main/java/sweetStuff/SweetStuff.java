package sweetStuff;

public abstract class SweetStuff {
    private String name;
    private int weight;
    private double price;

    public SweetStuff() {}

    public SweetStuff(String name, int weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "name = " + name +
                ", weight = " + weight +
                ", price = " + price;
    }
}
