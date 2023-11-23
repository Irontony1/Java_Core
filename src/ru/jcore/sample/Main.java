package ru.jcore.sample;

import ru.jcore.regular.Arithmetic;
import ru.jcore.regular.Randomizer;

/**
 * Основной класс приложения для вычисления базовых арифметических операций
 */
public class Main {
    /**
     * Точка входа в программу
     * @param args стандартные аргументы командной строки
     */
    public static void main(String[] args) {
        Arithmetic.add(Randomizer.randomInt(),Randomizer.randomInt());
        Arithmetic.mul(Randomizer.randomInt(),Randomizer.randomInt());
        Arithmetic.div(Randomizer.randomInt(),Randomizer.randomInt());
        Arithmetic.sub(Randomizer.randomInt(),Randomizer.randomInt());
    }
}