package ru.jcore.regular;

/**
 * Декоратор. Преображает результат работы программы в понятный полизователю
 */
public class Decorator {
    /**
     * Функция декорирования числа для вывода в консоль
     * в виде строки "Result %ы number %d"
     *
     * @param a результат вычислений
     * @param s тип опарации
     */
    public static void decorate(int a, String s) {

        switch (s) {
            case "/" -> System.out.printf("Result / number %d\n", a);
            case "+" -> System.out.printf("Result + number %d\n", a);
            case "*" -> System.out.printf("Result * number %d\n", a);
            default -> System.out.printf("Result %s number %d\n", s, a);
        }
    }
}
