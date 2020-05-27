/**
 * Задание №4
 *
 * 1. Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
 * Найти максимальный отрицательный и минимальный положительный элементы массива. Поменять их местами.
 * */

public class Task_4_part1 {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        int min = -10;
        int max = 10;
        // Заполняем массив случайными числами в интервале с min по max
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) (Math.random() * ((max - min) + 1)) + min;
        }
        // Выводим массив на экран
        for (int x : myArray) {
            System.out.print(x + " ");
        }
        // Ищем минимальный положительный элемент и фиксируем его индекс
        int minPositive = max;
        int minPositiveIndex = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < minPositive) {
                if (myArray[i] < 0)
                    continue;
                minPositive = myArray[i];
                minPositiveIndex = i;
            }
        }
        // Ищем максимальный отрицательный элемент и фиксируем его индекс
        int maxNegativ = min;
        int maxNegativIndex = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > maxNegativ) {
                if (myArray[i] >= 0)
                    continue;
                maxNegativ = myArray[i];
                maxNegativIndex = i;
            }
        }
        System.out.println(" ");
        /*System.out.println("minPositive = " + minPositive + " индекс = " + minPositiveIndex);
        System.out.println("maxNegativ = " + maxNegativ + " индекс = " + maxNegativIndex);*/
        // Меняем местами элементы в массиве
        int temp = myArray[minPositiveIndex];
        myArray[minPositiveIndex] = myArray[maxNegativIndex];
        myArray[maxNegativIndex] = temp;
        // Выводим отредактированный массив на экран
        for (int x : myArray) {
            System.out.print(x + " ");
        }
    }
}
