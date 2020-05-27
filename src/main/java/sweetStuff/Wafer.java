package sweetStuff;

public  class Wafer extends SweetStuff{
    private String kind;
    public Wafer(String name, int weight, double price, String kind) {
        super(name, weight, price);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return "Wafer {" + super.toString() +
                " kind = " + kind  +
                '}';
    }
}
