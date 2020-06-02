package Calculator;

public class Division implements Calculator {
    public Division() {
    }

    @Override
    public double calc(double num1, double num2) throws ArithmeticException {
        if (num2 == 0){
            throw new ArithmeticException();
        }
        return (num1 / num2);
    }
}
