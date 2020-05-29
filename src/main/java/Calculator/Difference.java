package Calculator;

public class Difference implements Calculator{
    public Difference() {
    }

    @Override
    public int calc(int num1, int num2) {
        return num1 - num2;
    }
}
