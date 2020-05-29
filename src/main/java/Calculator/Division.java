package Calculator;

public class Division implements Calculator {
    public Division() {
    }

    @Override
    public int calc(int num1, int num2) {
        return (num1 / num2);
    }
}
