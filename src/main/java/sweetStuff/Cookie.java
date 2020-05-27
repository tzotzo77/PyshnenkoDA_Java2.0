package sweetStuff;

public class Cookie extends SweetStuff {
    private String form;

    public Cookie(String name, int weight, double price, String form) {
        super(name, weight, price);
        this.form = form;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String toString() {
        return "Cookie {" + super.toString() +
                " form = " + form +
                '}';
    }
}
