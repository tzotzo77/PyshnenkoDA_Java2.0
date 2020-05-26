/**
 * Задание 3
 * <p>
 * 1. Реализовать базовые операции калькулятора (+,-,/,*) для предыдущего задания
 * <p>
 * 2. Поиск максимального элемента в массиве.
 * Для начала задать массив слов.Размерность массива произвольна, задается в консоли.
 * После чего в консоли вводятся слова в количестве равном заданной длине массива.
 * В полученном массиве необходимо найти самое длинное слово. Результат вывести на консоль
 * <p>
 * 3. Программа должна выполнять одно из заданий на выбор.
 * Если в консоли ввести 1 - запуститься выполнение калькулятора, если 2 - поиск максимального слова в массиве.
 *
 * @author PyshnenkoDA
 * @see #calc(double num1, double num2, char operation) - калькулятор
 * @see #findTheLongestWordInArray() - поиск максимального слова в массиве
 */

import java.util.Scanner;

public class Task_3 {
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

    public static void findTheLongestWordInArray() {
        Scanner sc1 = new Scanner(System.in); // объект класса Scanner для чтения целых чисел
        Scanner sc2 = new Scanner(System.in); // объект класса Scanner для чтения строк
        System.out.print("Задайте размер массива : ");
        int arrLength = sc1.nextInt();
        /* Проверка на ввод размерности массива.
        Для корректной работы программы массив должен содержать минимум 1 элемент */
        if (arrLength <= 0) {
            System.out.println("Массив не содержит ни одного элемента !");
            System.out.println("Заполнять не во что, выводить нечего...");
        } else {
            String[] myArray = new String[arrLength];
            System.out.println("Введите слова в массив");
            // Заполняем массив строками
            for (int i = 0; i < myArray.length; i++) {
                System.out.print("Слово под индексом " + i + " = ");
                String arrElement = sc2.nextLine();
                myArray[i] = arrElement;
            }
            // Поиск строки с нибольшей длиной
            String maxLengthWord = myArray[0];
            for (int i = 1; i < myArray.length; i++) {
                if (myArray[i].length() > myArray[i - 1].length()) {
                    maxLengthWord = myArray[i];
                }
            }
            // Вывод в консоль строки с нибольшей длиной.
            // Тестовка учитывает вариант, если найдено 2 и более строки с максимальной длиной
            System.out.println("Самое длинное слово в массиве с наименьшим индексом - " + maxLengthWord);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите программу : (1 - Калькулятор, 2 - Поиск самого длинного слова в массиве)");
        int programNumber = scan.nextInt();
        switch (programNumber) {
            case 1:
                System.out.printf("%.4f", calc(getNum1(), getNum2(), getOperation()));
                break;
            case 2:
                findTheLongestWordInArray();
                break;
            default:
                System.out.println("Неверный номер программы!");
        }
    }
}
