package src;
/**
 * Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
 */

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов массива ");
        Scanner scanner = new Scanner(System.in);
        int lenMassive = scanner.nextInt();
        int[] array = new int[lenMassive];
        int cnt = 0;
        for (int i = 0; i < lenMassive; i++) {
            System.out.print("Введите число ");
            array[i] = scanner.nextInt();
            if (array[i] % 3 == 0) {
                cnt++;
                //можно прямо здесь сделать вывод System.out.print(result[i] + " ");
                //но я сделал еще один массив для более удобочитаемого вывода
            }
        }
        int[] result = new int[cnt];
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                result[res] = array[i];
                res++;
            }
        }
        if (res > 0) {
            System.out.print("Числа кратные трем: ");
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
        } else {
            System.out.println("Чисел кратных трем в массиве нет");
        }
    }
}
