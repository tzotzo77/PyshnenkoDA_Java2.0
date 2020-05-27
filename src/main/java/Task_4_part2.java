/**
 * Задание №4
 *
 * 2. Формируется новогодний подарок.
 * Он может включать в себя разные сладости (Candy, Jellybean, etc.)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр.
 * Необходимо собрать подарок из сладостей.
 * Найти общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в подарке.
 */

import sweetStuff.Candy;
import sweetStuff.Cookie;
import sweetStuff.SweetStuff;
import sweetStuff.Wafer;

public class Task_4_part2 {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Ledinetz", 10, 15.5, "lollipop");
        Candy candy2 = new Candy();
        candy2.setName("BirdMilk");
        candy2.setWeight(8);
        candy2.setPrice(29.99);
        candy2.setType("milk");
        Cookie cookie1 = new Cookie("Pechenka", 15, 10.5, "square");
        Wafer wafer1 = new Wafer("Vafelko", 21, 21, "chocolate");
        SweetStuff[] present = {candy1, candy2, cookie1, wafer1};
        int totalWeight = 0;
        double totalPrice = 0;
        System.out.println("Congratulations !!! You've received a present : ");
        for (int i = 0; i < present.length; i++) {
            totalWeight += present[i].getWeight();
            totalPrice += present[i].getPrice();
            System.out.println(present[i].toString());
        }
        System.out.println("Total present weight = " + totalWeight);
        System.out.println("Total present price = " + totalPrice);
    }
}
