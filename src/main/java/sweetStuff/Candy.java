package sweetStuff;

public class Candy extends SweetStuff {
    private String type;

    public Candy () {}

    public Candy(String name, int weight, double price, String type) {
        super(name, weight, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Candy {" + super.toString() +
                " type = " + type +
                '}';
    }
}
