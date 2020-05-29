package Calculator;

public class Sum implements Calculator {
    public Sum() {
    }

    @Override
    public int calc(int num1, int num2) {
        return num1 + num2;
    }
}
