package Calculator;

public class Multiplication implements Calculator {
    public Multiplication() {
    }

    @Override
    public int calc(int num1, int num2) {
        return num1 * num2;
    }
}
