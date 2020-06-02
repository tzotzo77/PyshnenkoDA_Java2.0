package Calculator;

public class Multiplication implements Calculator {
    public Multiplication() {
    }

    @Override
    public double calc(double num1, double num2) {
        return num1 * num2;
    }
}
