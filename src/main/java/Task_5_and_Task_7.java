import java.util.*;
import Calculator.Difference;
import Calculator.Division;
import Calculator.Multiplication;
import Calculator.Sum;

public class Task_5_and_Task_7 {
    public static double getNum1() { // метод получения первого числа с консольного ввода
        Scanner scanInt1 = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        double n1 = 0;
        try {
            n1 = scanInt1.nextDouble();
        }catch (InputMismatchException ex){
            System.out.println("Ошибка " + ex);
            System.out.println("Некорректный ввод числа! Поробуйте снова..");
            getNum1();
        }
        return n1;
    }

    public static double getNum2() { // метод получения второго числа с консольного ввода
        Scanner scanInt2 = new Scanner(System.in);
        System.out.print("Введите второе число : ");
        double n2 = scanInt2.nextDouble();
        return n2;
    }

    public static char getOperation() { // метод получения знака операции с консольного ввода
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите операцию : (+ : сумма, - : разность, * : произведение, / : частное)");
        char oper = sc.next().charAt(0);
        return oper;
    }

    public static void main(String[] args) {
        char operation = getOperation();
        switch (operation) {
            case '+':
                Sum sum = new Sum();
                System.out.println("Результат = " + sum.calc(getNum1(), getNum2()));
                break;
            case '-':
                Difference diff = new Difference();
                System.out.println("Результат = " + diff.calc(getNum1(), getNum2()));
                break;
            case '*':
                Multiplication mult = new Multiplication();
                System.out.println("Результат = " + mult.calc(getNum1(), getNum2()));
                break;
            case '/':
                try {
                    Division div = new Division();
                    System.out.println("Результат = " + div.calc(getNum1(), getNum2()));
                } catch (ArithmeticException e) {
                    System.out.println("Ошибка " + e);
                    System.out.println("На ноль делить нельзя!!!");
                }
                break;
            default:
                System.out.println("Неверная операция! ");
        }
    }
}
