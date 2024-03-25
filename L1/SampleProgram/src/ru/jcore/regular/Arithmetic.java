package ru.jcore.regular;

/**
 * Класс арифметических операций
 * Здесь производятся арифметические опарации над целыми числами
 */
public class Arithmetic {
    /**
     * Функция суммирования двух целых чисел
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * Результат операции передается в Decorator для вывода в консоль.
     * */

    public static void add(int a, int b) {
        int result = a + b;
        Decorator.decorate(result, "+"); //вызов декоратора с результатом вычисления и флагом операции
    }
    /**
     * Функция деления двух целых чисел
     *
     * @param a делимое
     * @param b делитель
     * Результат операции передается в Decorator для вывода в консоль.
     * */
    public static void div(int a, int b) {
        int result = a / b;
        Decorator.decorate(result, "/"); //вызов декоратора с результатом вычисления и флагом операции
    }
    /**
     * Функция умножения двух целых чисел
     *
     * @param a первый множитель
     * @param b второй множитель
     * Результат операции передается в Decorator для вывода в консоль.
     * */
    public static void mul(int a, int b) {
        int result = a * b;
        Decorator.decorate(result, "*"); //вызов декоратора с результатом вычисления и флагом операции
    }
    /**
     * Функция разности двух целых чисел
     *
     * @param a уменьшаемое
     * @param b вычитаемое
     * Результат операции передается в Decorator для вывода в консоль.
     * */
    public static void sub(int a, int b) {
        int result = a - b;
        Decorator.decorate(result, "-"); //вызов декоратора с результатом вычисления и флагом операции
    }
}
 