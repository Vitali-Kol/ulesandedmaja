package org.example;
/*
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // Массивы с названиями цветов и животных
    private static final String[] COLORS = {"Зеленый", "Красный", "Желтый", "Белый", "Черный"};
    private static final String[] ANIMALS = {"Крыса", "Корова", "Тигр", "Заяц", "Дракон", "Змея", "Лошадь", "Овца", "Обезьяна", "Курица", "Собака", "Свинья"};

    public static void main(String[] args) {
        int year = 2016; // любой год
        System.out.println(getYearName(year));
    }

    // Метод для получения названия года по восточному календарю
    public static String getYearName(int year) {
        int cycleStartYear = 1984;
        int cycleLength = 60;

        // Считаем разницу между текущим годом и началом цикла
        int yearDifference = (year - cycleStartYear) % cycleLength;

        // Вычисляем индекс цвета и животного
        int colorIndex = (yearDifference % 10) / 2;  // Один цвет повторяется 2 года подряд
        int animalIndex = yearDifference % 12;

        // Возвращаем название года
        return COLORS[colorIndex] + " " + ANIMALS[animalIndex];
    }
}
*/

import java.util.Random;
import java.util.Scanner;

public class Main {

    // Цвета для консоли (ANSI-коды)
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int correctAnswers = 0;  // Счетчик правильных ответов

        // Генерируем 5 примеров
        for (int i = 0; i < 5; i++) {
            int number1 = random.nextInt(10) + 1;  // Случайное число от 1 до 10
            int number2 = random.nextInt(10) + 1;

            System.out.print("Сколько будет " + number1 + " * " + number2 + "? ");
            int userAnswer = scanner.nextInt();

            int correctAnswer = number1 * number2;

            // Проверяем ответ
            if (userAnswer == correctAnswer) {
                correctAnswers++;
                System.out.println(ANSI_GREEN + "Правильно!" + ANSI_RESET);
            } else {
                System.out.println(ANSI_RED + "Ошибка! Правильный ответ: " + correctAnswer + ANSI_RESET);
            }
        }

        // Выводим результат
        System.out.println("\nРезультат: " + correctAnswers + "/5 правильных ответов");

        // Оценка прохождения теста
        if (correctAnswers == 5) {
            System.out.println(ANSI_GREEN + "Молодец!" + ANSI_RESET);
        } else if (correctAnswers >= 3) {
            System.out.println(ANSI_RED + "Надо бы еще поучить." + ANSI_RESET);
        } else {
            System.out.println(ANSI_RED + "Срочно нужно учить таблицу умножения!" + ANSI_RESET);
        }

        scanner.close();
    }
}

