/**
 * Задание 2
 * Начинаем писать калькулятор:
 * Реализовать сложение дробных чисел, которые пользователь вводит в консоль.
 * Использовать комментарии и JavaDoc при описании метода.
 * Использовать форматирование при выводе результата в консоль.
 * Полученный результат округлять до 4-х знаков после запятой.
 * *Добавить возможность выбора другой операции (сложение, вычитание, деление, умножение)
 *
 * @author PyshnenkoDA
 * @see #calc(double num1, double num2, char operation) - калькулятор
 */

import java.util.Scanner;

public class Task_2 {
    public static double getNum1() { // метод получения первого числа с консольного ввода
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число : ");
        double n1 = sc.nextDouble();
        return n1;
    }

    public static double getNum2() { // метод получения второго числа с консольного ввода
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите второе число : ");
        double n2 = sc.nextDouble();
        return n2;
    }

    public static char getOperation() { // метод получения знака операции с консольного ввода
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите знак операции : ");
        String operString = sc.nextLine();
        char oper = operString.toCharArray()[0];
        return oper;
    }

    /**
     * @param num1      - первое число, результат метода getNum1()
     * @param num2      - второе число, результат метода getNum2()
     * @param operation - знак операции, результат метода getOperation()
     * @return result - результат вычисления
     * @see #getNum1()
     * @see #getNum2()
     * @see #getOperation()
     */
    public static double calc(double num1, double num2, char operation) {
        double result = 0;
        /* В зависимости от выбраного знака
        исполняем соответствующую операцию */
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.print("Сумма : ");
                break;
            case '-':
                result = num1 - num2;
                System.out.print("Разность : ");
                break;
            case '*':
                result = num1 * num2;
                System.out.print("Произведение : ");
                break;
            case '/':
                // проверка деления на ноль
                if (num2 == 0) {
                    System.out.print("Нельзя делить на ");
                } else {
                    result = num1 / num2;
                    System.out.print("Частное : ");
                }
                break;
            default:
                System.out.println("Неверная операция!");
                /* Так как в случае ввода неверной операции метод calc все равно вернет result = 0
                 * нужно как-то это обыграть*/
                System.out.print("Напоминаем что нельзя делить на ");
        }
        return result;
    }

    public static void main(String[] args) {
        // выводим в консоль отформатированный результат вычисления калькулятора
        System.out.printf("%.4f", calc(getNum1(), getNum2(), getOperation()));
    }
}
