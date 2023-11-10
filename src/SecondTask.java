package src;
/**
 * Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет,
 * то вывести "Нет такого имени"
 */

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        System.out.print("Введите имя ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
