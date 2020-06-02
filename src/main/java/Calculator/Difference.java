package Calculator;

public class Difference implements Calculator{
    public Difference() {
    }

    @Override
    public double calc(double num1, double num2) {
        return num1 - num2;
    }
}
