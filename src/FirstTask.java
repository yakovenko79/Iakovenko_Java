package src;
/**
 * Составить алгоритм: если введенное число больше 7, то вывести “Привет”
 */

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 7) {
            System.out.println("Привет");
        }
    }
}