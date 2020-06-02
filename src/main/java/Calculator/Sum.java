package Calculator;

public class Sum implements Calculator {
    public Sum() {
    }

    @Override
    public double calc(double num1, double num2) {
        return num1 + num2;
    }
}
