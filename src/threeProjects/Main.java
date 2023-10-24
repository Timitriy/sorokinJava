package threeProjects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1:
        System.out.println("Задание 1: Введите число:");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }

        scanner.nextLine();

        // Задание 2:
        System.out.println("\nЗадание 2: Введите имя:");
        String name = scanner.nextLine();
        if ("Вячеслав".equals(name)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        // Задание 3:
        System.out.println("\nЗадание 3: Введите количество элементов в массиве:");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("Введите " + length + " чисел:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        //было ли найдено хоть одно число, кратное 3
        boolean divisibleByThreeFound = false;

        System.out.println("Числа, кратные 3:");
        for (int i = 0; i < length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
                divisibleByThreeFound = true;
            }
        }

        // Если чисел, кратных трем, не найдено, сообщаем об этом
        if (!divisibleByThreeFound) {
            System.out.println("Чисел, кратных 3, не найдено.");
        }

        scanner.close();
    }
}
