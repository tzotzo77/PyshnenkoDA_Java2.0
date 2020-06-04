import Calculator.*;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    @Test
    public void sumOfTwoNumbers()
    {
        Sum sum = new Sum();
        double x = 7.545;
        double y = 8.000;
        double result = sum.calc(x, y);
        assertEquals("Некорректная сумма чисел", x + y, result, result - (x + y) );
    }

    @Test
    public void differenceOfTwoNumbers()
    {
        Difference diff = new Difference();
        double x = 7.545;
        double y = 8.000;
        double result = diff.calc(x, y);
        assertEquals("Некорректная разность чисел", x - y, result, result - (x - y) );
    }

    @Test
    public void multiplicationOfTwoNumbers()
    {
        Multiplication mult = new Multiplication();
        double x = 7.545;
        double y = 8.000;
        double result = mult.calc(x, y);
        assertEquals("Некорректное произведение чисел", x * y, result, result - (x * y) );
    }

    @Test
    public void divisionOfTwoNumbers()
    {
        Division div = new Division();
        double x = 7.545;
        double y = 8.000;
        double result = div.calc(x, y);
        assertEquals("Некорректное частное чисел", x / y, result, result - (x / y) );
    }

    @Test
    public void divisionByZero()
    {
        Division div = new Division();
        double x = 7.545;
        double y = 0;
        ArithmeticException exception = null;
        try {
            div.calc(x, y);
        }catch (ArithmeticException e){
            exception = e;
            System.out.println("Ошибка " + e);
            System.out.println("На ноль делить нельзя!!!");
        }
        Assert.assertNotNull("Не выброшен эксепшн ArithmeticException", exception);
    }
}
